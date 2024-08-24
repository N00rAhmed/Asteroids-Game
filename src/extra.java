import java.awt.FlowLayout;
import java.awt.MediaTracker;

import javax.swing.*;

public class extra extends JPanel  {
	
	
	private ImageIcon image1;
	private JLabel label1;
	
	extra(){
		setLayout(new FlowLayout());
		
		image1 = new ImageIcon(getClass().getResource("./src/asteroid.png"));
		label1 = new JLabel(image1);
		add(label1);
		
		
//		ImageIcon image = new ImageIcon("asteroid.png");

	}

	

}

