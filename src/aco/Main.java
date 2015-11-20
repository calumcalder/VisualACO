/**
 * Application to visualise Ant Colony Optimisations on the Travelling Salesman Problem.
 * 
 * @Author Calum Calder <info@calum-calder.com>
 * @Version 1.0
 */
package aco;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;

public class Main {
	
	/**
	 * Creates the JFrame in which the map is rendered.
	 */
	static void createFrame() {
		JFrame frame = new JFrame() {{
			this.setTitle("VisualACO");
			this.getContentPane().add(new Renderer());
			this.setSize(new Dimension(510, 510));
			this.setVisible(true);
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}};	
	}
	
	public static void main(String[] args) {
	
	}
	
}