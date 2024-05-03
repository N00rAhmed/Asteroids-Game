import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.color.*;
import java.awt.*;
import java.awt.event.*;


public class Asteroids extends Rectangle{
	
	Color color;
	
	Asteroids(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	
//	public void paint(Graphics g) {
////		setSize(500,500);
//		g.drawOval(100, 100, 50, 50, Color.black);
//	}
	
	public void draw(Graphics g){
		
        Graphics2D g2d = (Graphics2D) g;
        // Translate to the centre of the spaceship
        g2d.translate(this.x + this.width / 2, this.y + this.height / 2);
        
        // Translate back to the original position
        g2d.translate(-this.x - this.width / 2, -this.y - this.height / 2);

		g.setColor(this.color);
        int[] xPoints = {this.x, this.x + this.width / 2, this.x + this.width};
        int[] yPoints = {this.y, this.y + this.height, this.y};
        int nPoints = 3;
//        g.drawPolygon(xPoints, yPoints, nPoints);
        g.drawOval(100, 100, 50, 50);

        
	}
	
	
	public void somit() {
		System.out.println("hello world from the Asteroids Class");
	}
	

}
