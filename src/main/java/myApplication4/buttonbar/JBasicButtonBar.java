package myApplication4.buttonbar;

import javax.swing.UIManager;

//import com.l2fprod.common.swing.JButtonBar;
//import com.l2fprod.common.swing.plaf.ButtonBarUI;
import myApplication4.style.button.AbstractButtonUI;
import myApplication4.style.button.flat.FlatButtonUI;
import myApplication4.style.buttonbar.ButtonBarUI;
import myApplication4.style.buttonbar.IButtonBarUI;

public class JBasicButtonBar
	//extends JButtonBar
{
	/**
	 * Constructs with the default.
	 */
	public JBasicButtonBar()
	{
		//super();
	}
	
	/**
	 * Constructs with the specified initial orientation.
	 * @param orientation the orientation value
	 */
	public JBasicButtonBar(int orientation)
	{
		//super(orientation);
	}
	
	/**
	 * Sets the ui.
	 * @param buttonBarUI the instance of ButtonBarUI
	 */
	public void setUI(ButtonBarUI buttonBarUI)
	{
		/*super.setUI(buttonBarUI);
		
		if (buttonBarUI instanceof IButtonBarUI)
		{
			AbstractButtonUI buttonUI = ((IButtonBarUI) buttonBarUI).getButtonUI();
			if (buttonUI instanceof FlatButtonUI)
			{
				setBackground(UIManager.getColor("Panel.background"));
			}
		}*/
	}
}