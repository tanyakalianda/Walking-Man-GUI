import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class WalkingMan extends JComponent
{
		// have keyListener move / change the object's position
		//keyListener goes on the frame itself (not on the component)
		//must use the repaint() method and Ellipse2D.Double()
	
	private Ellipse2D.Double head;
	private Rectangle arm1;
	private Rectangle arm2;
	private Rectangle body;
	private Rectangle leg1;
	private Rectangle leg2;
	
	public WalkingMan()
	{
		
	}
		
		
	

}
