import java.awt.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.awt.Color;

public class Spaceship extends Rectangle{
	
	Color color;
	
//	boolean rotatingLeft = false;
//	boolean rotatingRight = false;
	
	int rotation = 0;
	int speed = 10; //define speed of spaceship
	//	make it now go in the direction of the rotation

	Spaceship(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void keyPressed(KeyEvent e){
//		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
//			this.y=y-10;
//			moveInDirection(rotation - 90, speed);

//			in the future see how you can make the physics better
			
//		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			moveInDirection(rotation + 90, speed);   // Adjust the direction by 180 degrees for downward movement
		}
		
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.rotation -= 5; // decrease rotatiion angle
			System.out.println(rotation);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.rotation += 5; // increase rotation angle 
			System.out.println(rotation);

		}
			
	}
	
	
	public void moveInDirection(int angle, int distance) {
		double radians = Math.toRadians(angle);
		int dx = (int) (distance * Math.cos(radians));
		int dy = (int) (distance * Math.sin(radians));
		this.x += dx;
		this.y += dy;
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

	}
}
