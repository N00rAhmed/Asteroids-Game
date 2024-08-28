import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class extra extends JPanel {

    private ImageIcon image1; // Holds the image
    private Image image; // For scaling or direct manipulation
    private JLabel label1;

    public extra() {
        // Set layout and load image
        setLayout(new FlowLayout());
        
        // Load image using absolute path
        try {
            image1 = new ImageIcon("C:\\Users\\Noor\\Desktop\\PROGRAMMING\\Java-Asteroids-Game\\Asteroids_Game\\logo.jpg");
            image = image1.getImage(); // Store the image for use in paintComponent()
            
            // Scale the image if needed
            image = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            
            // Alternatively, use JLabel for the initial display
            label1 = new JLabel(new ImageIcon(image));
            add(label1); // Add JLabel to the panel
        } catch (Exception e) {
            System.out.println("Error: Image file not found. " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call to superclass to handle default painting
        if (image != null) {
            // Draw the image at the specified position
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }

    public void imagedisplay() {
        System.out.println("hello from extra class");
        repaint(); // Ensure repainting occurs after setting up the image
    }
}
