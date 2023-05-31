package myApplication4;

import javax.swing.SwingUtilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//https://github.com/l2fprod/l2fprod-common
//https://github.com/jidesoft/jide-oss
//https://github.com/DmytroRybka/nepxion
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
      
       logger.info("APP_STARTED");
   	SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new MainFrame().setVisible(true);
			}
		});
    }
}
