import java.awt.*;
import java.awt.event.*;

public class Spaceship extends Rectangle{
		
	Color color;
	
	Bullets bullets;
	
	int rotation = 0;
	Graphics graphics;

	// speed = 10
	int speed = 10; //define speed of spaceship
	
	
	Spaceship(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		bullets = new Bullets(x, y, 10, 20, Color.white);
	}
	
	
	public void keyPressed(KeyEvent e){
		
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			moveInDirection(rotation + 90, speed);
		}

		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			// 5
			this.rotation -= 5; // decrease rotation angle
			System.out.println(rotation);
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// 5
			this.rotation += 5; // increase rotation angle 
			System.out.println(rotation);

		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			bullets.bulletMessage();
			bullets = new Bullets(x, y, 10, 20, Color.white);
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
        
//        Bullets bullets = new Bullets;
//        bullets = new Bullets(100, 200, 50, 50, Color.white);

        if (y <= 0) { // if off the top move to bottom
        	y = 600;
        	System.out.println(y);
        }  
        if (y > 600) { // if off botttom move to top
        	y = 1;
        	System.out.println(y);
        }
        
        if (x <= 0) {
        	x = 800;
        	System.out.println(x);
        }
        if (x > 800) {
        	x = 1;
        	System.out.println(x);
        }
        
//		bullets = new Bullets(100, 200, 50, 50, Color.white);
        
//        bullets = new Bullets(x, y, width, height, color);

//        bullets.draw(g2d);
        
        // Translate to the centre of the spaceship
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
