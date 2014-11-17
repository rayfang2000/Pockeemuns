import java.util.*;


public class Main
{
public static void main(String[] args)
{
	int k =1;
	while(k!=0)
	{
	System.out.println("What is your name?");
	 Scanner sc = new Scanner(System.in);
     String i = sc.nextLine();
     System.out.println("Your name is "+i+". Is that correct? Yes or No?");
     Scanner sc1 = new Scanner(System.in);
     String rekt = sc1.nextLine();
     if(rekt.equals("Yes")||rekt.equals("yes"))
     {
    	 k=0;
     }
     }
	while(k==0)
	{
	System.out.println("What pokemon do you want? Charmander,Bulbasaur, or Squirtle?");
	Scanner sc2 = new Scanner(System.in);
    String r = sc2.nextLine();
    if(r.equals("Charmander")||r.equals("charmander"))
    {
   	 k=0;
    }
    else if(r.equals("Bulbasaur")||r.equals("bulbasaur"))
    {
   	 k=0;
    }
    else if(r.equals("Yes")||r.equals("yes"))
    {
   	 k=0;
    }
    else
    {
    	System.out.println("thatss not one of the choices");
    	
    }
    }
	
	System.out.println("");
	}
	
}
