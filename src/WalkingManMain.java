import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WalkingManMain 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(150,200,500,300);
		myFrame.setLayout(null);
		
		WalkingMan man = new WalkingMan(50,50);
		myFrame.add(man);

		addKeyListener(new KeyListener()
			{
		
			}
		
		
		
		
		
		myFrame.setVisible(true);;
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
