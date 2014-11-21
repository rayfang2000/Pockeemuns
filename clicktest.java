//click mechanics by Nigel
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;


public class clicktest extends JFrame implements ActionListener{
	int clicked = 0;
	public void clicktest() {
		 String aString = Integer.toString(clicked);
		setTitle("Pokeemun attack mechanics");
		setSize(450,125);
		JLabel save = new JLabel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			FlowLayout flo = new FlowLayout();
		JButton button  = new JButton("ATTACK!");
		JLabel pageLabel = new JLabel(aString, (int)JLabel.CENTER_ALIGNMENT);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    clicked++;
			    String aString = Integer.toString(clicked);
			   pageLabel.setText(aString);
			    System.out.println(aString);
			}
		
			});
		
		setResizable( false );
		
		add(pageLabel);
		setLayout(flo);
		setVisible(true);
		add(save);
		add(button);
	}
	
	

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
		}
		catch (Exception exc) {
		}
		
	
	}
	public static void main(String[] args) {
		clicktest click = new clicktest();
		click.clicktest();
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
