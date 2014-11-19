//concept GUI http://i.imgur.com/d37J5x6.png 
// proj by Nigel
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

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
		setResizable( false );
		setLayout(flo);
		JButton checkpoints = new JButton("Play!");
		JButton test = new JButton("New Game!");
		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				roughdraft testlol = new roughdraft();
				testlol.introduction();
				System.exit(0);
			}

		
				
			});
			

		JButton test1 = new JButton("GitHub");
		test1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	try {
					Desktop.getDesktop().browse(new URL("https://github.com/Compurnee/Pockeemuns").toURI());
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
            	System.exit(0);
            }
        });
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
