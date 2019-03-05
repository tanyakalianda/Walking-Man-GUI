import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WalkingManMain extends JFrame
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
					man.setLocation(man.getLocation() + 5);
				}
				else if (key == KeyEvent.VK_LEFT)
				{
					x = x - 5;
				}
				else if (key == KeyEvent.VK_UP)
				{
					
				}
				else if (key == KeyEvent.VK_DOWN)
				{
					moveDown();
				}
				
				//http://www.java2s.com/Tutorials/Java/Swing_How_to/JFrame/Use_KeyListener_with_JFrame.htm
				//https://stackoverflow.com/questions/21997130/how-to-use-keylistener-with-jframe
			}
		
			public void keyTyped(KeyEvent e)
			{
				
			}
			
			public void keyReleased(KeyEvent e)
			{
				
			}
		});
	
		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args)
	{
		new WalkingManMain();
	}
}
