package myApplication4.container;

import java.awt.Component;

import javax.swing.JPanel;

public class JContainer
	extends JPanel
{
	/**
	 * Constructs with the default.
	 */
	public JContainer()
	{
		
	}
	
	/**
	 * Adds the component to a container.
	 * The container will remove all child components before adding a new component.
	 * @param addedComponent the added component
	 */
	public void addComponent(Component addedComponent)
	{
		ContainerManager.add(this, addedComponent);
	}
	
	/**
	 * Adds the component to a container.
	 * The container will remove all child components before adding a new component.
	 * @param addedComponent the added component
	 * @param constraints the constraints object
	 */
	public void addComponent(Component addedComponent, Object constraints)
	{
		ContainerManager.add(this, addedComponent, constraints);
	}
	
	/**
	 * Adds the component to a container.
	 * The container will remove the specified component before adding a new component.
	 * @param container the container
	 * @param addedComponent the added component
	 * @param removedComponent the removed component
	 */
	public void add(Component addedComponent, Component removedComponent)
	{
		ContainerManager.add(this, addedComponent, removedComponent);
	}
	
	/**
	 * Adds the component to a container.
	 * The container will remove the specified component before adding a new component.
	 * @param addedComponent the added component
	 * @param removedComponent the removed component
	 * @param constraints the constraints object 
	 */
	public void addComponent(Component addedComponent, Component removedComponent, Object constraints)
	{
		ContainerManager.add(this, addedComponent, removedComponent, constraints);
	}	
	
	/**
	 * Updates the container.
	 */
	public void update()
	{
		ContainerManager.update(this);
	}	
}