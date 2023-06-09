package myApplication4.popupmenu;


import java.awt.Component;
import java.awt.Insets;

import javax.swing.UIManager;

import myApplication4.popupmenu.JidePopup;

public class JDraggablePopupMenu
	extends JidePopup
{
	/**
	 * Constructs with the default.
	 */
	public JDraggablePopupMenu()
	{
		setResizable(true);
		setMovable(true);
		setBackground(UIManager.getColor("Panel.background"));
		
		PopupMenuManager.setPreferenceStyle(this);
	}
	
	/**
	 * Shows the popup menu.
	 * @param insets the instance of Insets
	 * @param owner the instance of Component
	 */
	public void showPopup(Insets insets, Component owner)
	{
		setDefaultFocusComponent(getContentPane());
		
		super.showPopup(insets, owner);
	}
	
	/**
	 * Updates the ui.
	 */
	public void updateUI()
	{
		super.updateUI();
		
		setBackground(UIManager.getColor("Panel.background"));
	}
}