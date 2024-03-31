import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;


public class MyFrame extends JFrame {

	Image image;
	Graphics graphics;
	Spaceship player;
	Spaceship enemy;
	boolean gameOver;
	
	
	MyFrame(){

//		player = new Spaceship(100,300,50,50,Color.blue);
		player = new Spaceship(100, 300, 50, 100,Color.blue);

		enemy = new Spaceship(400,300,50,50,Color.red);
		
		gameOver = false;

//		JFrame frame = new JFrame(); // creates a frame
		this.setTitle("Asteroids Game"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // stops frame being resized
		this.setSize(850,600); //set x and y dimension on frame

		
		this.setVisible(true); //make frame visible
		this.addKeyListener(new AL());

		System.out.println("Welcome to the Java Asteroids Game");

		ImageIcon image = new ImageIcon("logo.jpg"); // create image icon
		this.setIconImage(image.getImage()); // change icon of frame
		
		
//		this.getContentPane().setBackground(Color.black);
		
	}
	
	public void paint(Graphics g){
		
	    // Set the background colour
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
		// Create an image and get its graphics for double buffering
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
	    
		// Draw the background color on the image's graphics
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());

		// Draw the spaceships on the image's graphics
		player.draw(graphics);
		enemy.draw(graphics);

	    // Draw the image on the frame's graphics
		g.drawImage(image,0,0,this);
		
		if (gameOver) {
			g.setColor(Color.red);
			g.setFont(new Font("MV Boli", Font.PLAIN,45));
			g.drawString("GAME OVER!!!", 150, 100);
		}

	}
	

	
	
	
	
	public void checkCollision() {
		if(player.intersects(enemy)) {
			gameOver = true;
			System.out.println("game over");
		}
	}
	public class AL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			
			player.keyPressed(e);
			checkCollision();
			repaint();
			
		}
	}
}
