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
					man.setLocation(man.getX() + 5, man.getY());
				}
				else if (key == KeyEvent.VK_LEFT)
				{
					man.setLocation(man.getX() - 5, man.getY());
				}
				else if (key == KeyEvent.VK_UP)
				{
					man.setLocation(man.getX(), man.getY() - 5 );
				}
				else if (key == KeyEvent.VK_DOWN)
				{
					man.setLocation(man.getX(), man.getY() + 5);
				}
			}
		
			public void keyTyped(KeyEvent e)
			{
				
			}
			
			public void keyReleased(KeyEvent e)
			{
				
			}
		});
			
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new WalkingManMain();
	}

}
