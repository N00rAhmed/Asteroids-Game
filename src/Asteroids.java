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

		
	public void draw(Graphics g){
		
        Graphics2D g2d = (Graphics2D) g;
        
		g.setColor(this.color);
//        int[] xPoints = {this.x, this.x + this.width / 2, this.x + this.width};
//        int[] yPoints = {this.y, this.y + this.height, this.y};
//        int nPoints = 3;
//        g.drawPolygon(xPoints, yPoints, nPoints);
        g.drawOval(100, 100, 50, 50);

        
	}
	
	
	public void somit() {
		System.out.println("hello world from the Asteroids Class");
	}
	

}
