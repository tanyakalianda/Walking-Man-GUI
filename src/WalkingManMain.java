import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame 
{	
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	
	public WalkingManMain()
	{
		setTitle("Walking Man");
		setBounds(150,200,500,300);
		setLayout(null);
		
		WalkingMan man = new WalkingMan(200,100);
		add(man);

		addKeyListener(new KeyListener()
		{
		public void keyPressed(KeyEvent e)
			{
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_RIGHT)
				{
					//man.setLocation(man.getX() + 5, man.getY())
					man.setdx(3);
				}
				else if (key == KeyEvent.VK_LEFT)
				{
					//man.setLocation(man.getX() - 5, man.getY());
					man.setdx(-3);
				}
				else if (key == KeyEvent.VK_UP)
				{
					//man.setLocation(man.getX(), man.getY() - 5 );
					man.setdy(-3);
				}
				else if (key == KeyEvent.VK_DOWN)
				{
					//man.setLocation(man.getX(), man.getY() + 5);
					man.setdy(3);
				}
				else if (key == KeyEvent.VK_SPACE)
				{
					Ball ball1 = new Ball();
					ball1.setLocation(man.getX(),man.getY());
					balls.add(ball1);
					add(ball1);
				}
			}
		
			public void keyTyped(KeyEvent e)
			{
				
			}
			
			public void keyReleased(KeyEvent e)
			{
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_RIGHT)
				{
					man.setdx(0);
				}
				else if (key == KeyEvent.VK_LEFT)
				{
					man.setdx(0);
				}
				else if (key == KeyEvent.VK_UP)
				{
					man.setdy(0);
				}
				else if (key == KeyEvent.VK_DOWN)
				{
					man.setdy(0);
				}
			}
		});
		
		Timer t1 = new Timer(100, new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (man.getdx() == 3 && man.getX() >= getWidth() - man.getWidth()-16)
				{
					man.setdx(0);
				}
				else if (man.getdx() == -3 && man.getX() <= 0) 
				{
					man.setdx(0);
				}
				
				if (man.getdy() == -3 && man.getY() <= 0)
				{
					man.setdy(0);
				}
				else if (man.getdy() == 3 && man.getY() >= getHeight() - man.getHeight()-38)
				{
					man.setdy(0);
				}
				
				man.update();
				
				for (int i = 0; i < balls.size(); i++)
				{
					if (balls.get(i).getX() <= 0 || balls.get(i).getX() >= getWidth() - balls.get(i).getWidth())
					{
						balls.remove(i);
					}					
				}
				for(Ball ball: balls)
					ball.update();
				repaint();
			}
		});
		t1.start();
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new WalkingManMain();
	}
}
