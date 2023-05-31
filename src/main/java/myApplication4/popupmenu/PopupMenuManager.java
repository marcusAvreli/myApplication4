package myApplication4.popupmenu;

import java.awt.Color;

import javax.swing.JPopupMenu;

import myApplication4.border.LineBorder;
//import LookAndFeelManager

public class PopupMenuManager
{
	/**
	 * Sets the preference style for the popup menu.
	 * @param popupMenu the instance of JPopupMenu
	 */	
	public static void setPreferenceStyle(JPopupMenu popupMenu)
	{
		popupMenu.setBorder(new LineBorder(new Color(89, 89, 89), 1));
		
	}
	
	/**
	 * Sets the preference style for the draggable popup menu.
	 * @param popupMenu the instance of JDraggablePopupMenu
	 */	
	public static void setPreferenceStyle(JDraggablePopupMenu popupMenu)
	{
		
			popupMenu.setBorder(new LineBorder(new Color(89, 89, 89), 1));
			
	}
	
	/**
	 * Gets the margin.
	 * @return the margin value
	 */
	public static int getMargin()
	{
		
			return 1;
		
	}
}