import java.awt.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.awt.Color;

public class Asteroids extends Rectangle {
	
	Color color;
	
	Asteroids(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
        // Translate to the centre of the spaceship
        g2d.translate(this.x + this.width / 2, this.y + this.height / 2);

        // Translate back to the original position
        g2d.translate(-this.x - this.width / 2, -this.y - this.height / 2);

		g.setColor(this.color);
        int[] xPoints = {this.x, this.x + this.width / 2, this.x + this.width};
        int[] yPoints = {this.y, this.y + this.height, this.y};
        int nPoints = 3;
        g.drawPolygon(xPoints, yPoints, nPoints);

	}
	
	
}
