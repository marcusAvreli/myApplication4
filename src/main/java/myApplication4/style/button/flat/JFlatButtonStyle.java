package myApplication4.style.button.flat;

import javax.swing.UIManager;

public class JFlatButtonStyle
	extends AbstractFlatButtonStyle
{
	/**
	 * The identity value.
	 */
	public static final String ID = JFlatButtonStyle.class.getName();
	
	/**
	 * Constructs with the default.
	 */
	public JFlatButtonStyle()
	{
		brightColor = UIManager.getColor("Button.background").brighter();
		darkColor = UIManager.getColor("Button.background").darker();
	}
}