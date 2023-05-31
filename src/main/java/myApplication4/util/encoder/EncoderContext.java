package myApplication4.util.encoder;


public class EncoderContext
	implements EncoderConstants
{	
	/**
	 * The io charset string.
	 * It is mainly used for getting the io-stream with the native file and object. 
	 */
	private static String ioCharset = DEFAULT_CHARSET;
	
	/**
	 * The http charset string.
	 * It is mainly used for getting the io-stream with the remote file and object. Currently it is only support http mode.
	 */
	private static String httpCharset = DEFAULT_CHARSET;
	
	/**
	 * Registers the io charset.
	 * @param ioCharset the io charset string
	 */
	public static void registerIOCharset(String ioCharset)
	{
		EncoderContext.ioCharset = ioCharset;
	}
	
	/**
	 * Gets the io charset.
	 * @return the registered io charset string
	 */
	public static String getIOCharset()
	{
		return ioCharset;
	}
	
	/**
	 * Registers the http charset.
	 * @param httpCharset the http charset string
	 */
	public static void registerHttpCharset(String httpCharset)
	{
		EncoderContext.httpCharset = httpCharset;
	}
	
	/**
	 * Gets the http charset.
	 * @return the registered http charset string
	 */
	public static String getHttpCharset()
	{
		return httpCharset;
	}
}