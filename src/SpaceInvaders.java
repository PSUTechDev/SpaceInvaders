import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class SpaceInvaders extends JFrame {

	public SpaceInvaders() {
		// Frame stuff
		this.setTitle("TechDev Space Invaders");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.setVisible(true);		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SpaceInvaders();
			}
		});
	}

}
