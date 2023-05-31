package myApplication4.l2fprod;

import javax.swing.AbstractButton;
import javax.swing.plaf.ComponentUI;

/**
 * Pluggable UI class for <code>ButtonBar</code>.
 */
public abstract class ButtonBarUI extends ComponentUI {

  /**
   * Called when an AbstractButton is added to a ButtonBarUI. It allows
   * pluggable UI to provide custom UI for the buttons added to the ButtonBar.
   * 
   * @param button
   */
  public void installButtonBarUI(AbstractButton button) {
  }

}