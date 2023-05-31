package myApplication4.border;

import java.awt.Color;

import myApplication4.jidesoft.swing.PartialEtchedBorder;

public class ComplexEtchedBorder
	extends PartialEtchedBorder
{
	/**
	 * Constructs with the default.
	 */
	public ComplexEtchedBorder()
	{
		super();
	}
	
	/**
	 * Constructs with the specified initial sides.
	 * @param sides the sides value
	 */
	public ComplexEtchedBorder(int sides)
	{
		super(sides);
	}
	
	/**
	 * Constructs with the specified initial etchType and sides.
	 * @param etchType the etch type
	 * @param sides the sides value
	 */
	public ComplexEtchedBorder(int etchType, int sides)
	{
		super(etchType, sides);
	}
	
	/**
	 * Constructs with the specified initial highlight, shadow and sides.
	 * @param highlight the highlight color
	 * @param shadow the shadow color
	 * @param sides the sides color
	 */
	public ComplexEtchedBorder(Color highlight, Color shadow, int sides)
	{
		super(highlight, shadow, sides);
	}
	
	/**
	 * Constructs with the specified initial etchType, highlight, shadow and sides.
	 * @param etchType the etch type
	 * @param highlight the highlight color
	 * @param shadow the shadow color
	 * @param sides the sides color
	 */
	public ComplexEtchedBorder(int etchType, Color highlight, Color shadow, int sides)
	{
		super(etchType, highlight, shadow, sides);
	}
}