package myApplication4.tip.balloon;


import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BalloonTipDecoration
	extends MouseAdapter implements KeyListener
{
	private JBalloonTip balloonTip;
	private Component component;
	
	public BalloonTipDecoration(Component component)
	{
		this.component = component;
		this.component.addMouseListener(this);
		this.component.addKeyListener(this);
		this.balloonTip = new JBalloonTip(component);
	}
	
	public Component getComponet()
	{
		return component;
	}
	
	public JBalloonTip getBalloonTip()
	{
		return balloonTip;
	}
	
	public void mouseClicked(MouseEvent e)
	{
		balloonTip.setVisible(false);
	}
	
	public void keyPressed(KeyEvent e)
	{
		balloonTip.setVisible(false);
	}
	
	public void keyReleased(KeyEvent e)
	{
		
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}
}