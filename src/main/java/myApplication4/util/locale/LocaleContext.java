package myApplication4.util.locale;

import java.util.Locale;

public class LocaleContext
	implements LocaleConstants
{
	/**
	 * Registers the locale.
	 * @param locale the instance of Locale
	 */
	public static void registerLocale(Locale locale)
	{
		Locale.setDefault(locale);
	}
	
	/**
	 * Registers the locale by a language.
	 * @param language the language string
	 */
	public static void registerLocale(String language)
	{
		Locale locale = getLocale(language);
		Locale.setDefault(locale);
	}
	
	/**
	 * Gets the default locale.
	 * @return the instance of Locale
	 */
	public static Locale getLocale()
	{
		return Locale.getDefault();
	}
	
	/**
	 * Gets the locale by a language.
	 * @param language the language string
	 * @return the instance of Locale
	 */
	public static Locale getLocale(String language)
	{
		for (int i = 0; i < LOCALE_LIST.length; i++)
		{
			Locale locale = LOCALE_LIST[i];
			if (locale.toString().toLowerCase().equals(language.toLowerCase()))
			{
				return locale;
			}	
		}
		
		return LOCALE_EN_US;
	}
}
