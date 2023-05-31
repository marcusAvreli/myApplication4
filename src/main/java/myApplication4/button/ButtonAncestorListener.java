package myApplication4.button;

import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class ButtonAncestorListener
	implements AncestorListener
{
	/**
	 * Invoked when the ancestor has been added.
	 * @param e the instance of AncestorEvent
	 */
	public void ancestorAdded(AncestorEvent e)
	{
		JButton defaultButton = (JButton) e.getComponent();
		JRootPane rootPane = SwingUtilities.getRootPane(defaultButton);
		if (rootPane != null)
		{
			rootPane.setDefaultButton(defaultButton);
		}
	}
	
	/**
	 * Invoked when the ancestor has been removed.
	 * @param e the instance of AncestorEvent
	 */
	public void ancestorRemoved(AncestorEvent event)
	{
	}
	
	/**
	 * Invoked when the ancestor has been moved.
	 * @param e the instance of AncestorEvent
	 */
	public void ancestorMoved(AncestorEvent event)
	{
	}
}