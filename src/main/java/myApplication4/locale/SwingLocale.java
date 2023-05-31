package myApplication4.locale;

import java.util.Locale;

import myApplication4.util.locale.LocaleManager;

public class SwingLocale
{
	/**
	 * The bundle class for SwingLocale.
	 * It is mainly used for the i18n of Nepxion-Swing, The configuration files 
	 * of SwingLocale is at the folder "nepxion-swing/locale/com/nepxion/swing/locale".
	 * Locale.properties is the i18n for zh_CN locale (You also can change it to another language), Locale_en_US.properties is the i18n for en_US.
	 * You can run "Locale.bat" to generate Locale_zh_CN.properties by the Locale.properties.
	 */
	public static final Class BUNDLE_CLASS = SwingLocale.class;
	
	/**
	 * Gets the i18n string by a key.
	 * @param key the key string
	 * @return the i18n string
	 */
	public static String getString(String key)
	{
		return LocaleManager.getString(BUNDLE_CLASS, key);
	}
	
	/**
	 * Gets the i18n string withe the given locale by a key.
	 * @param key the key string
	 * @return the i18n string
	 */
	public static String getString(String key, Locale locale)
	{
		return LocaleManager.getString(BUNDLE_CLASS, key, locale);
	}
}