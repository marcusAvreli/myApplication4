package myApplication4.style.button;

public interface IButtonUI
{
	/**
	 * Gets the button style.
	 * @return the instance of IButtonStyle
	 */
	public IButtonStyle getButtonStyle();
	
	/**
	 * Sets the button style.
	 * @param buttonStyle the instance of IButtonStyle
	 */
	public void setButtonStyle(IButtonStyle buttonStyle);
}