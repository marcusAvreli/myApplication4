package myApplication4.popupmenu.plaf;

import javax.swing.plaf.ComponentUI;
import java.awt.*;

/**
 * ComponentUI for PopupUI.
 */
public abstract class PopupUI extends ComponentUI {
    abstract public Component getGripper();
}