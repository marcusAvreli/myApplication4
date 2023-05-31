package myApplication4.popupmenu;

public class PopupMenuContext
implements PopupMenuConstants
{	
/**
 * The title string.
 */
private static String title = DEFAULT_TITLE;

/**
 * Registers the title.
 * @param title the title string
 */
public static void registerTitle(String title)
{
	PopupMenuContext.title = title;
}

/**
 * Gets the title.
 * @return the title string
 */
public static String getTitle()
{
	return title;
}
}