import javax.swing.*;

public class extra extends JFrame {
	

    second s;

    extra() {
    	
//        // Set the title of the JFrame
//        setTitle("Moving Circle Example");
//
//        // Set the default close operation
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set the size of the JFrame
//        setSize(850,600);

        // Create an instance of the 'second' class
        s = new second();

        // Add the 'second' panel to the frame
        add(s);

        // Make the JFrame visible
//        setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure the creation and updates of the GUI are on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            new extra();
        });
    }
}
