import java.awt.*;
import java.awt.event.*;
import java.awt.Rectangle;
import java.awt.Color;

public class Spaceship extends Rectangle{
	
	Color color;
	
//	boolean rotatingLeft = false;
//	boolean rotatingRight = false;
	
	int rotation = 0;
	int a;
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
//			this moves upp because u add minus 10 units from y. if u add rotation variable then it will 
//			only make object go even more up. You need to Set the rotation value as the the new direction
//			for then the y to go up in that direction
			
//			look into direction vectors
// https://stackoverflow.com/questions/58574041/java-how-to-make-a-graphics-object-move-in-its-facing-direction			
			
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
			System.out.println(rotation);
//			this.y=y-5;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.rotation += 5; // increase rotation angle 
			System.out.println(rotation);

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
