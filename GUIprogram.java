//concept GUI http://i.imgur.com/d37J5x6.png 
// *not in service!
import java.awt.FlowLayout;

import javax.swing.*;
public class GUIprogram extends JFrame {
	public GUIprogram() {
		setTitle("Pokeemans");
		setSize(450,125);
		JLabel pageLabel = new JLabel("Pokeemuns game 0.1 ALPHA", (int) JLabel.CENTER_ALIGNMENT);
		JLabel save = new JLabel("Enter your checkpoint access code if you have one.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField checkpoint = new JTextField(10);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton checkpoints = new JButton("Play!");
		JButton test = new JButton("New Game!");
		JButton test1 = new JButton("GitHub");
		add(pageLabel);
		add(test);
		add(test1);
		add(save);
		add(checkpoint);
		add(checkpoints);
		
		setVisible(true);
	}
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		}
		catch (Exception exc) {
			//ignore error
		}
		
	}
	public static void main(String[] args) {
		GUIprogram frame = new GUIprogram();
	}
}
