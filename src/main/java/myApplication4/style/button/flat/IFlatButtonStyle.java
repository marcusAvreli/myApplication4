package myApplication4.style.button.flat;


import java.awt.Color;

import myApplication4.style.button.IButtonStyle;

public interface IFlatButtonStyle
	extends IButtonStyle
{
	/**
	 * Gets the bright color.
	 * @return the instance of Color
	 */
	public Color getBrightColor();
	
	/**
	 * Gets the dark color.
	 * @return the instance of Color
	 */
	public Color getDarkColor();
}