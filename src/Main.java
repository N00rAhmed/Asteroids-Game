// import javax.swing.JPanel;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
//		MyFrame myFrame = new MyFrame();

		
		second s = new second();
		JFrame f = new JFrame();
		f.add(s);
		f.setVisible(true);
		f.setSize(850,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("moving graphic hopefully");
	}

}
