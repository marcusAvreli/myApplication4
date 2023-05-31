package myApplication4.icon;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import myApplication4.App;

public class IconFactory
	implements IconConstants
{private static final Logger logger = LoggerFactory.getLogger(IconFactory.class);
	/**
	 * The map of the icon cache pool.
	 */
	private static Map iconPool = new HashMap();
	
	/**
	 * Gets the icon in swing icon folder by an icon name.
	 * The icon name must not be included the folder string.
	 * For example : property.png, config.gif
	 * @param iconName the icon name string
	 * @return the instance of ImageIcon
	 */
	public static ImageIcon getSwingIcon(String iconName)
	{
		String pathName = SWING_ICON_FOLDER + iconName;
		//logger.info("IconFactory:"+pathName);
		return getIcon(pathName);
	}
	
	/**
	 * Gets the icon by an icon name in context icon folder which is registered in IconContext. 
	 * The icon name must not be included the folder string.
	 * For example : property.png, config.gif
	 * @return the instance of ImageIcon
	 */
	public static ImageIcon getContextIcon(String iconName)
	{
		return getIcon(IconContext.getIconFolder() + iconName);
	}
	
	/**
	 * Gets the blank icon.
	 * @return the instance of ImageIcon
	 */
	public static ImageIcon getBlankIcon()
	{
		return getIcon(SWING_BLANK_ICON);
	}
	
	/**
	 * Gets the icon by an icon full path.
	 * If the icon is not existed, the blank icon will be returned.
	 * @param iconFullPath the icon full path string
	 * @return the instance of ImageIcon
	 */
	public static ImageIcon getIcon(String iconFullPath)
	{
		Object iconObject = iconPool.get(iconFullPath);
		if (iconObject != null)
		{
			
			return (ImageIcon) iconObject;
		}
		else
		{
			ImageIcon icon = createIcon(iconFullPath);
			if (icon == null)
			{
				
				Object blankIconObject = iconPool.get(SWING_BLANK_ICON);
				if (blankIconObject != null)
				{
					return (ImageIcon) blankIconObject;
				}
				else
				{
				
					iconFullPath = SWING_BLANK_ICON;
					icon = createIcon(iconFullPath);
				}
			}
			
			iconPool.put(iconFullPath, icon);
			
			return icon;
		}
	}
	
	/**
	 * Creates the icon by an icon full path.
	 * @param iconFullPath  the icon full path string
	 * @return the instance of ImageIcon 
	 */
	private static ImageIcon createIcon(String iconFullPath)
	{
		URL iconURL = IconFactory.class.getClassLoader().getResource(iconFullPath);
		
		if (iconURL != null)
		{
			return new ImageIcon(iconURL);
		}
		
		return null;
	}
}