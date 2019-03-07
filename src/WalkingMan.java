import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;


public class WalkingMan extends JComponent
{
		//have keyListener move / change the object's position
		//keyListener goes on the frame itself (not on the component)
			//pay attention to arguments of key listener (det what keys were pressed)
			//useful letters: VK
		//must use the repaint() method and Ellipse2D.Double()
		//optional to change color w/ setColor() method
		//only method you need: paintComponent
	//dx and dy should be created in the walking man, not in the frame
	//with a timer, keyPress and keyRelease are controlling rate of change in both directions (Rate of Change)
	//with a timer, action listener is controlling the movement -> timer is constantly adding the ROC to the position
	//w/o pressing any buttons, ROC = 0 -> man doesn't move
	//press button -> change dx/dy -> that moves the man
	//for ball b: shots
	//b.update();
	
	private Ellipse2D.Double head;
	private Rectangle leftArm;
	private Rectangle rightArm;
	private Rectangle body;
	private Rectangle hips;
	private Rectangle leftLeg;
	private Rectangle rightLeg;
	private int dx = 0;
	private int dy;
	
	public WalkingMan(int x, int y)
	{
		dx = 0;
		dy = 0;
		this.setLocation(x, y);
		this.setSize(26,46);              //sets the size for the frame of the WalkingMan - should be 1 pixel greater than the walking man's dimensions              
		head = new Ellipse2D.Double(10,0,10,10);
		leftArm = new Rectangle(5,10,10,5);
		rightArm = new Rectangle(15,10,10,5);
		body = new Rectangle(12,15,5,15);
		hips = new Rectangle(8,30,15,5);
		leftLeg = new Rectangle(8,35,5,10);
		rightLeg = new Rectangle(18,35,5,10);		
	}
		
	public void paintComponent(Graphics g)   //this parameter is always a graphics2D object -> any time you see the paintComponent method overwritten, use 1st line below
	{
		Graphics2D paint = (Graphics2D) g;    //casts g as a Graphics2D object so you don't have to do it every time
		paint.draw(head);
		paint.draw(leftArm);
		paint.draw(rightArm);
		paint.draw(body);
		paint.draw(hips);
		paint.draw(leftLeg);
		paint.draw(rightLeg);
		paint.setColor(Color.BLACK);
	}	
	
	public void update()
	{
		setLocation(getX() + dx, getY() + dy); 
	}
	
	public void setdx(int x)
	{
		dx = x;
	}
	
	public void setdy(int y)
	{
		dy = y;
	}
}
