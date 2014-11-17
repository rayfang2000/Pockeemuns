package roughdraft;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class roughdraft {
//introduction function
	public static void introduction() {
		int k =1;
		//START OF INTRODUCTION
		while(k!=0)
		{
		
		String name = JOptionPane.showInputDialog(null,"Welcome adventurer! Give me your name!","Access save code: 'paly'");
	    String confirmname = JOptionPane.showInputDialog("Your name is "+name+". Is that correct? 'Yes' or 'No'?");
	    
	     if(confirmname.equalsIgnoreCase("yes"))
	     {
	    	//START OF RIVAL NAME
	    	 String rivalname=JOptionPane.showInputDialog(null,"You have a friend that lives next to you! What is your friends name?");
	    	 JOptionPane.showMessageDialog(null,"Ah, I see! Your friends name is " + rivalname+"! Your new adventure awaits, " + name+"!");
	    	 k=0;
	     }
	     }
		//END OF INTRODUCTION
		//START OF CHOOSING POKEMEN
		while(k==0)
		{
		String r = JOptionPane.showInputDialog("You make your way to Prof. Oak's office. \n What pokemon do you want? 'Charmander' , 'Bulbasaur' , or 'Squirtle'?");
		
	    if(r.equalsIgnoreCase("charmander"))
	    {

	    }
	    else if(r.equalsIgnoreCase("bulbasaur"))
	    {

	    }
	    else if(r.equalsIgnoreCase("squirtle"))
	    {

	   	 	String confirmsq = JOptionPane.showInputDialog("You have chosen " +r+", are you sure? 'Yes' or 'no'?");
	   	 	if (confirmsq.equalsIgnoreCase("no")) {
	   	 		k=0;
	   	 	}
	   	 	else if(confirmsq.equalsIgnoreCase("yes")){
	   	 	JOptionPane.showMessageDialog(null, "You and your " + r +" will now spend the rest of your far journey together!");
	   	 		k=1;
	   	 	}
	   	 	else {
	   	 		k=0;
	   	 	}
	    }
	    else{
	    JOptionPane.showMessageDialog(null,"Sorry, I didn't get that.");
		k=0;
	    }
		}
		//END OF CHOOSING POKEMEN.
	}
// main function
	public static void main(String[] args) {
		String title= JOptionPane.showInputDialog("Welcome to the game! \n If you want to load a save, enter your access checkpoint!\n Otherwise, you can type in anything to start a new game.");
		switch (title) {
		case "paly": 
			rd test = new rd();
			rd.introduction();
			break;
		default:
			JOptionPane.showInputDialog("Welcome to the game of- POKEMANS!");
		}
		rd test = new rd();
		rd.introduction();
		}
	}
