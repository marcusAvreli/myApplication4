package myApplication4.icon;

public class IconContext
	implements IconConstants
{
	/**
	 * the context icon folder string.
	 */
	private static String iconFolder = "";
	
	/**
	 * Registers the context icon folder.
	 * @param iconFolder the context icon folder string.
	 */
	public static void registerIconFolder(String iconFolder)
	{
		IconContext.iconFolder = iconFolder;
	}
	
	/**
	 * Gets the context icon folder.
	 * @return  the context icon folder string. 
	 */
	public static String getIconFolder()
	{
		return iconFolder;
	}
}