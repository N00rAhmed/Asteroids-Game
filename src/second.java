import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer.*;
import javax.swing.Timer;
//import java.util.Timer;


import java.awt.geom.*;

import javax.swing.JPanel;

public class second extends JPanel implements ActionListener{
	
	Color color;

	Timer t = new Timer(5, this);
	double X = 0, Y = 0, velX = 2, velY = 2;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
	    // Set the stroke to a white color
	    // g2.setStroke(new BasicStroke(3)); // Adjust the thickness as needed
	    g2.setColor(Color.WHITE); // Set the color to white
	    
	    // Draw the circle with a white border
		Ellipse2D circle = new Ellipse2D.Double(X, Y, 40, 40);
//		g2.fill(circle);
		g2.draw(circle);
		
		t.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (X < 0 || X > 800) {
			velX = -velX;
		}
		if (Y < 0 || Y > 525) {
			velY = -velY;
		}
		
		X += velX;
		Y += velY;
		repaint();
	}
	
}
