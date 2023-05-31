package myApplication4.dimension;

import java.awt.Component;
import java.awt.Dimension;

public class DimensionManager
{
	/**
	 * Adapts the component dimension with the preferred size.
	 * @param component the instance of Component
	 */
	public static void adaptDimension(Component component)
	{
		setDimension(component, component.getPreferredSize());
	}
	
	/**
	 * Sets the component dimension by a dimension.
	 * @param component the instance of Component
	 * @param dimension the instance of Dimenion
	 */
	public static void setDimension(Component component, Dimension dimension)
	{
		component.setPreferredSize(dimension);
		component.setMaximumSize(dimension);
		component.setMinimumSize(dimension);
		component.setSize(dimension);
	}
}