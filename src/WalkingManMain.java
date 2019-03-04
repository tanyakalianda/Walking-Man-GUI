import java.awt.event.ActionListener;
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
			public void (keyReleased (keyEvent e))
			{
				//http://www.java2s.com/Tutorials/Java/Swing_How_to/JFrame/Use_KeyListener_with_JFrame.htm
				//https://stackoverflow.com/questions/21997130/how-to-use-keylistener-with-jframe
			}
		}
			
	
		
		
		
		
		
		setVisible(true;;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
