package myApplication4.style.button.flat;

import java.awt.Color;

public abstract class AbstractFlatButtonStyle
	implements IFlatButtonStyle
{
	/**
	 * The bright color.
	 */
	protected Color brightColor;
	
	/**
	 * The dark color.
	 */
	protected Color darkColor;
	
	/**
	 * Gets the bright color.
	 * @return the instance of Color
	 */
	public Color getBrightColor()
	{
		return brightColor;
	}
	
	/**
	 * Gets the dark color.
	 * @return the instance of Color
	 */
	public Color getDarkColor()
	{
		return darkColor;
	}
}