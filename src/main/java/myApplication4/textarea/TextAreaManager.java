package myApplication4.textarea;

import javax.swing.JTextArea;

//import com.nepxion.swing.color.ColorUtil;

public class TextAreaManager
{
	/**
	 * Sets the label style for the text area.
	 * @param textArea the instance of JTextArea
	 */
	public static void setLabelStyle(JTextArea textArea)
	{
		textArea.setBorder(null);
		//textArea.setBackground(ColorUtil.getUIManagerColor("Panel.background"));
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFocusable(false);
	}
}