package myApplication4.button;

import java.awt.Dimension;

public interface IButton
{
	/**
	 * Gets the width inset.
	 * @return the width inset value
	 */
	public int getWidthInset();
	
	/**
	 * Sets the width inset.
	 * @param widthInset the width inset value
	 */
	public void setWidthInset(int widthInset);
	
	/**
	 * Gets the height inset.
	 * @return the height inset value
	 */
	public int getHeightInset();
	
	/**
	 * Sets the height inset.
	 * @param heightInset the height inset value
	 */
	public void setHeightInset(int heightInset);
	
	/**
	 * Sets the dimension.
	 * @param dimension the instance of Dimension
	 */
	public void setDimension(Dimension dimension);
}