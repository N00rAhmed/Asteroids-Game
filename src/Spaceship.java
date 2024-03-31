import java.awt.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.awt.Color;

public class Spaceship extends Rectangle{
	
	Color color;

	Spaceship(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.y=y-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.y=y+10;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.x=x-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.x=x+10;
		}
	}
	
	public void draw(Graphics g){
		g.setColor(this.color);
        int[] xPoints = {this.x, this.x + this.width / 2, this.x + this.width};
        int[] yPoints = {this.y, this.y + this.height, this.y};
        int nPoints = 3;
        g.drawPolygon(xPoints, yPoints, nPoints);

//		g.fillRect(this.x, this.y, this.width, this.height);
	}
}
