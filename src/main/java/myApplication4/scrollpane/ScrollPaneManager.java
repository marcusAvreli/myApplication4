package myApplication4.scrollpane;

import java.awt.Color;

import javax.swing.JScrollPane;

public class ScrollPaneManager
{
	/**
	 * Sets the preference style for the scroll pane.
	 * @param scrollPane the instance of JScrollPane
	 */
	public static void setPreferenceStyle(JScrollPane scrollPane)
	{
		scrollPane.getViewport().setBackground(Color.white);
	}
	
	/**
	 * Sets the label style for the scroll pane.
	 * @param scrollPane the instance of JScrollPane
	 */
	public static void setLabelStyle(JScrollPane scrollPane)
	{
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);
	}
}