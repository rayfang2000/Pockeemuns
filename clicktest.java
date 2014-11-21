//click mechanics by Nigel
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;


public class clicktest extends JFrame implements ActionListener{
	//int clicked right here!
	int clicked = 0;
	public void clicktest() {
		//to conver the int into a string because JLabel does not pick up ints.
		 String aString = Integer.toString(clicked);
		 //USELESS JUNK:
		setTitle("Click counter for proj 28");
		setSize(450,125);
		JLabel save = new JLabel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			FlowLayout flo = new FlowLayout();
		//BUTTON TO CLICK SO IT WILL INCREMENT INT CLICKED.
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
		//end of button
		
		//JLabel sadly does not pick up the changes.
		//end of jlabel
		
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
			//ignore error
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
