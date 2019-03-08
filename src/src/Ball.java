import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Ball extends JComponent 
{
	private Ellipse2D.Double ball;         //creates a theoretical ball (***helps you draw the circle)
	 //components must have an x and y component so it can be moved
	//don't need to make the x and y coordinate for the ball a field b/c JComponent already has these methods -> this class inherits them
   private int dx;
   private int dy;
	
	public Ball()
	{
		dx = 0;
		dy = 0;
		ball = new Ellipse2D.Double(0,0,10,10);    //this ellipse has a location at (0,0), horizontal radius = 10, vertical radius = 10
		this.setSize(11,11);//(20,20) is based on where (0,0) of the JComponent
	}

	public void paintComponent(Graphics g)   //this parameter is always a graphics2D object -> any time you see the paintComponent method overwritten, use 1st line below
	{
		Graphics2D g2 = (Graphics2D) g;    //casts g as a Graphics2D object so you don't have to do it every time
		g2.draw(ball);
	}
	
	public void update()
	{
		this.setLocation(getX() + dx, getY() + dy);
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
