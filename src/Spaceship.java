import java.awt.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.awt.Color;

public class Spaceship extends Rectangle{
	
	Color color;
	
//	boolean rotatingLeft = false;
//	boolean rotatingRight = false;
	
	int rotation = 0;

	//	make it now go in the direction of the rotation

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
		
//		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
//			this.x=x-10;
//		}
//		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
//			this.x=x+10;
//		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.rotation -= 5; // decrease rotatiion angle
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.rotation += 5; // increase rotation angle 
		}
//		becuase of use of rotation variable we are not setting the location/direction which is done using x and y
	
	}
	
	public void draw(Graphics g){
		
        Graphics2D g2d = (Graphics2D) g;
        
        // Translate to the center of the spaceship
        g2d.translate(this.x + this.width / 2, this.y + this.height / 2);

        // rotate graphics content
        g2d.rotate(Math.toRadians(rotation));
        
        // Translate back to the original position
        g2d.translate(-this.x - this.width / 2, -this.y - this.height / 2);

        
		g.setColor(this.color);
        int[] xPoints = {this.x, this.x + this.width / 2, this.x + this.width};
        int[] yPoints = {this.y, this.y + this.height, this.y};
        int nPoints = 3;
        g.drawPolygon(xPoints, yPoints, nPoints);

//		g.fillRect(this.x, this.y, this.width, this.height);
	}
}