package myApplication4.button;


public interface IToggleButton
{
	/**
	 * Returns true if the button is grouped.
	 * If true, the toggle button will be added to a ButtonGroup automatically.
	 * @return true if the button is grouped
	 */
	public boolean isGrouped();
	
	/**
	 * Sets the button grouped.
	 * @param isGrouped the boolean value of isGrouped
	 */
	public void setGrouped(boolean isGrouped);
}