package myApplication4.popupmenu.plaf;

import java.awt.Component;
import java.awt.Container;
import java.awt.Shape;
import java.awt.Window;
import java.lang.reflect.Method;

import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JRootPane;
import javax.swing.JWindow;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

public class JideSwingUtilities {
	   /**
     * Sets the Window opaque using AWTUtilities.setWindowOpaque on JDK6u10 and later.
     *
     * @param window the Window
     * @param opaque true or false
     */
    public static void setWindowOpaque(Window window, boolean opaque) {
        try {
            Class<?> c = Class.forName("com.sun.awt.AWTUtilities");
            Method m = c.getMethod("setWindowOpaque", Window.class, boolean.class);
            m.invoke(null, window, opaque);
        }
        catch (Exception e) {
            // ignore
        }
    }

    /**
     * Sets the Window opacity using AWTUtilities.setWindowOpacity on JDK6u10 and later.
     *
     * @param window  the Window
     * @param opacity the opacity
     */
    public static void setWindowOpacity(Window window, float opacity) {
        try {
            Class<?> awtUtilitiesClass = Class.forName("com.sun.awt.AWTUtilities");
            Method mSetWindowOpacity = awtUtilitiesClass.getMethod("setWindowOpacity", Window.class, float.class);
            mSetWindowOpacity.invoke(null, window, opacity);
        }
        catch (Exception ex) {
            // ignore
        }
    }

    /**
     * Sets the Window shape using AWTUtilities.setWindowOpacity on JDK6u10 and later.
     *
     * @param window the Window
     * @param shape  the shape
     */
    public static void setWindowShape(Window window, Shape shape) {
        try {
            Class<?> c = Class.forName("com.sun.awt.AWTUtilities");
            Method m = c.getMethod("setWindowShape", Window.class, Shape.class);
            m.invoke(null, window, shape);
        }
        catch (Exception e) {
            // ignore
        }
    }
    
    /**
     * If c is a JRootPane descendant return its outermost JRootPane ancestor. If c is a RootPaneContainer then return
     * its JRootPane.
     *
     * @param c the component.
     * @return the outermost JRootPane for Component c or {@code null}.
     */
    public static JRootPane getOutermostRootPane(Component c) {
        if (c instanceof RootPaneContainer && c.getParent() == null) {
            return ((RootPaneContainer) c).getRootPane();
        }
        JRootPane lastRootPane;
        for (; c != null; c = SwingUtilities.getRootPane(c)) {
            if (c instanceof JRootPane) {
                lastRootPane = (JRootPane) c;
                if (c.getParent().getParent() == null) {
                    return lastRootPane;
                }
                if (c.getParent() instanceof JDialog || c.getParent() instanceof JWindow
                        || c.getParent() instanceof JFrame || c.getParent() instanceof JApplet) {
                    return lastRootPane;
                }
                c = c.getParent().getParent();
            }
        }
        return null;
    }

    /**
     * Gets the first JComponent from the RootPaneContainer.
     *
     * @param rootPaneContainer a rootPaneContainer
     * @return the first JComponent from the rootPaneContainer's content pane.
     */
    public static JComponent getFirstJComponent(RootPaneContainer rootPaneContainer) {
        return (JComponent) getRecursively(rootPaneContainer.getContentPane(), new GetHandler() {
            public boolean condition(Component c) {
                return c instanceof JComponent;
            }

            public Component action(Component c) {
                return c;
            }
        });
    }
    /**
     * Gets to a child of a component recursively based on certain condition.
     *
     * @param c       component
     * @param handler handler to be called
     * @return the component that matches the condition specified in GetHandler.
     */
    public static Component getRecursively(final Component c, final GetHandler handler) {
        return getRecursively0(c, handler);
    }

    private static Component getRecursively0(final Component c, final GetHandler handler) {
        if (handler.condition(c)) {
            return handler.action(c);
        }

        Component[] children = null;

        if (c instanceof JMenu) {
            children = ((JMenu) c).getMenuComponents();
        }
        else if (c instanceof Container) {
            children = ((Container) c).getComponents();
        }

        if (children != null) {
            for (Component child : children) {
                Component result = getRecursively0(child, handler);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
    public interface GetHandler {
        /**
         * If true, it will call {@link #action(java.awt.Component)} on this component.
         *
         * @param c the component
         * @return true or false.
         */
        boolean condition(Component c);

        /**
         * The action you want to perform on this component. This method will only be called if {@link
         * #condition(java.awt.Component)} returns true.
         *
         * @param c the component
         * @return the component that will be returned from {@link com.jidesoft.swing.JideSwingUtilities#getRecursively(java.awt.Component,
         * com.jidesoft.swing.JideSwingUtilities.GetHandler)}.
         */
        Component action(Component c);
    }

}
