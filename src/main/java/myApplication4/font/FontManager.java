package myApplication4.font;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Locale;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import myApplication4.util.io.FileUtil;

public class FontManager
{		
	/**
	 * Sets the font.
	 * @param fontName the font name string
	 * @param fontStyle the font style value
	 * @param fontSize the font size value
	 */
	public static void setFont(String fontName, int fontStyle, int fontSize)
	{
		Font font = new Font(fontName, fontStyle, fontSize);

		setFont(font);
	}
		
	/**
	 * Sets the font.
	 * @param font the instance of Font
	 */
	public static void setFont(Font font)
	{		
		FontUIResource fontUIResource = new FontUIResource(font);
		for (Enumeration enumeration = UIManager.getDefaults().keys(); enumeration.hasMoreElements();)
		{
			Object key = enumeration.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource)
			{
				UIManager.getDefaults().remove(key);
				UIManager.getDefaults().put(key, fontUIResource);
			}
		}
	}
	
	/**
	 * Sets the font with an inputStream from a font file.
	 * @param fontPath the font path string
	 * @param fontStyle the font style value
	 * @param fontSize the font size value
	 */
	public static void setInputStreamFont(String fontPath, int fontStyle, int fontSize)
	{
		setInputStreamFont(fontPath, fontStyle, fontSize, false);
	}
	
	/**
	 * Sets the font with an inputStream from a font file.
	 * @param fontPath the font path string
	 * @param fontStyle the font style value
	 * @param fontSize the font size value
	 * @param classLoader classLoader the boolean value whether the inputStream is generated by the classLoader or not
	 */
	public static void setInputStreamFont(String fontPath, int fontStyle, int fontSize, boolean classLoader)
	{
		Font font = null;
		try
		{
			InputStream inputStream = FileUtil.getInputStream(fontPath, classLoader);
			font = Font.createFont(Font.TRUETYPE_FONT, inputStream);
			font = font.deriveFont(fontStyle, fontSize);
			inputStream.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			font = FontContext.getFont();
		}
		
		setFont(font);
	}
	
	/**
	 * Gets all fonts.
	 * @return the font array
	 */
	public static Font[] getAllFonts()
	{
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
	}
	
	/**
	 * Gets all available font family names
	 * @return the font name array
	 */
	public static String[] getAvailableFontFamilyNames()
	{
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
	}
	
	/**
	 * Gets all available font family names by a locale.
	 * @param locale the instance of Locale
	 * @return the font name array
	 */
	public static String[] getAvailableFontFamilyNames(Locale locale)
	{
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(locale);
	}
	
	/**
	 * Draw string at the component center position horizontally and vertically.
	 * @param g2d the instance of Graphics2D
	 * @param text the text string
	 * @param componentWidth the component width value
	 * @param componentHeight the component height value
	 * @param horizontalGap the horizontal gap value
	 * @param verticalGap the vertical gap value
	 */
	public static void drawCenterString(Graphics2D g2d, String text, int componentWidth, int componentHeight, int horizontalGap, int verticalGap)
	{
		FontMetrics fontMetrics = g2d.getFontMetrics();
		
		drawCenterString(g2d, fontMetrics, text, componentWidth, componentHeight, horizontalGap, verticalGap);
	}
	
	/**
	 * Draw string at the component center position horizontally and vertically.
	 * @param g2d the instance of Graphics2D
	 * @param font the instance of Font
	 * @param text the text string
	 * @param componentWidth the component width value
	 * @param componentHeight the component height value
	 * @param horizontalGap the horizontal gap value
	 * @param verticalGap the vertical gap value
	 */
	public static void drawCenterString(Graphics2D g2d, Font font, String text, int componentWidth, int componentHeight, int horizontalGap, int verticalGap)
	{
		FontMetrics fontMetrics = g2d.getFontMetrics(font);
		
		drawCenterString(g2d, fontMetrics, text, componentWidth, componentHeight, horizontalGap, verticalGap);
	}
	
	/**
	 * Draw string at the component center position horizontally and vertically.
	 * @param g2d the instance of Graphics2D
	 * @param fontMetrics the instance of FontMetrics
	 * @param text the text string
	 * @param componentWidth the component width value
	 * @param componentHeight the component height value
	 * @param horizontalGap the horizontal gap value
	 * @param verticalGap the vertical gap value
	 */
	public static void drawCenterString(Graphics2D g2d, FontMetrics fontMetrics, String text, int componentWidth, int componentHeight, int horizontalGap, int verticalGap)
	{
		Rectangle2D r = fontMetrics.getStringBounds(text, g2d);
		
		int textWidth = (int) r.getWidth();
		int textHeight = (int) r.getHeight();
		
		int x = (componentWidth - textWidth) / 2 > 0 ? (componentWidth - textWidth) / 2 : 0;
		int y = (componentHeight - textHeight) / 2 > 0 ? (componentHeight - textHeight) / 2 : 0;
		
		x += horizontalGap;
		y += fontMetrics.getAscent() + verticalGap;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
		// g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		// g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
		
		g2d.drawString(text, x, y);
	}
}