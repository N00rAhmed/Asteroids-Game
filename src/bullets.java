import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.color.*;
import java.awt.*;
import java.awt.event.*;

public class Bullets extends Rectangle{
	
	Color color;

	Graphics graphics;

	Bullets(int x, int y, int width, int height, Color color){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
		g.setColor(this.color);

		g.drawOval(100, 200, 50, 50);
		
	}
	public void drawe(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
		g.setColor(this.color);
		g.drawOval(100, 300, 50, 50);
		
	}

	public void bulletMessage() {
		System.out.println("BULLET");
	}

}
