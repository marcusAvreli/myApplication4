package myApplication4.util.encoder;

import java.io.UnsupportedEncodingException;

public class EncoderUtil
{
	/**
	 * Formats the text with GB2312 charset.
	 * @param text the text string
	 * @return the formatted text string
	 * @throws UnsupportedEncodingException
	 * @see #format
	 */
	public static String formatGB2312(String text)
		throws UnsupportedEncodingException
	{
		return format(text, "GB2312");
	}	
	
	/**
	 * Formats the text with GBK charset.
	 * @param text the text string
	 * @return the formatted text string
	 * @throws UnsupportedEncodingException
	 * @see #format
	 */
	public static String formatGBK(String text)
		throws UnsupportedEncodingException
	{
		return format(text, "GBK");
	}		
	
	/**
	 * Formats the text with UTF-8 charset.
	 * @param text the text string
	 * @return the formatted text string
	 * @throws UnsupportedEncodingException
	 * @see #format
	 */
	public static String formatUTF8(String text)
		throws UnsupportedEncodingException
	{	
		return format(text, "UFT-8");
	}	
	
	/**
	 * Formats the text by a charset.
	 * The original charset is ISO-8859-1.
	 * @param text the text string
	 * @param transferCharset the transfer charset string
	 * @return the formatted text string
	 * @throws UnsupportedEncodingException
	 */
	public static String format(String text, String transferCharset)
		throws UnsupportedEncodingException
	{		
		return format(text, "ISO-8859-1", transferCharset);
	}	
	
	/**
	 * Formats the text by a charset.
	 * @param text the text string
	 * @param originCharset the origin charset string
	 * @param transferCharset the transfer charset string
	 * @return the formatted text string
	 * @throws UnsupportedEncodingException
	 */
	public static String format(String text, String originCharset, String transferCharset)
		throws UnsupportedEncodingException
	{
		return new String(text.getBytes(originCharset), transferCharset);
	}
}