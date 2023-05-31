package myApplication4.textfield;

import javax.swing.JTextField;

//import ColorUtil

public class TextFieldManager
{	
	/**
	 * Sets the label style for the text field.
	 * @param scrollPane the instance of JTextField
	 */
	public static void setLabelStyle(JTextField textField)
	{
		textField.setBorder(null);
		//textField.setBackground(ColorUtil.getUIManagerColor("Panel.background"));
		textField.setOpaque(false);
		textField.setEditable(false);
		textField.setFocusable(false);
	}
}