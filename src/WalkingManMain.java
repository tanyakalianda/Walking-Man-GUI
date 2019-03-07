import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame implements ActionListener 
{	
	public WalkingManMain()
	{
		setTitle("Walking Man");
		setBounds(150,200,500,300);
		setLayout(null);
		
		WalkingMan man = new WalkingMan(50,50);
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
					if (man.getX() >= getWidth() - man.getWidth())
					{
						man.setdx(0);
					}
				}
				else if (key == KeyEvent.VK_LEFT)
				{
					//man.setLocation(man.getX() - 5, man.getY());
					man.setdx(-3);
					if (man.getX() <= 0) 
					{
						man.setdx(0);
					}
				}
				else if (key == KeyEvent.VK_UP)
				{
					//man.setLocation(man.getX(), man.getY() - 5 );
					man.setdy(-3);
					if (man.getY() <= 0)
					{
						man.setdy(0);
					}
				}
				else if (key == KeyEvent.VK_DOWN)
				{
					//man.setLocation(man.getX(), man.getY() + 5);
					man.setdy(3);
					if (man.getY() >= getHeight() - man.getHeight())
					{
						man.setdy(0);
					}
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
				if (man.getX() == 0 || man.getX() == 500)
				{
					System.out.print("hello");
					man.setdx(0);
				}
				if (man.getY() == 0 || man.getY() == 300)
				{
					man.setdy(0);
				}
				man.update();
				repaint();
			}
		});
		t1.start();
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
//	public void actionPerformed(ActionEvent e)
//	{
//		man.update();
//		//for (Ball b: balls)
////		{
////			b.update();
////		}
//		repaint();
	//}
	
	public static void main(String[] args)
	{
		new WalkingManMain();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
}
