
package snake;
import java.util.*;
import java.io.*;

public class MyTuckshop { // class header which you need to change if coding in Net beans

    /**
     * @param args the command line arguments
     */

	// method to display the name of the tuckshop
	public static void printLoop(){
		for(int i = 0; i<=20; i++)
			System.out.print("***");
			System.out.println("");
			System.out.println("       ---------WELCOME TO BAMBAZONKE TUCKSHOP-------------");
		for(int i = 0; i<=20; i++)
			System.out.print("***");
			System.out.println("");
	}
	
	//Method to clear screen in java console. Do not bother yourself with this
	public static void clrscr(){

    

    try {

        if (System.getProperty("os.name").contains("Windows"))

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        else

            Runtime.getRuntime().exec("clear");

    } catch (IOException | InterruptedException ex) {}

}

	
    public static void main(String[] args) {
      clrscr();
	  Scanner myObject = new Scanner(System.in); // creating object of Scanner type
        //variable declarations
        String prodName;
        int prodPrice, prodQuant, totalPrice;
        int amountPaid, change;
        
		
		printLoop(); //method call
		
		
        //input section
        System.out.print("Enter product name: ");
        prodName = myObject.next();
        System.out.print("Enter product price:R");
        prodPrice = myObject.nextInt();
        System.out.print("Enter quantity sold: ");
        prodQuant = myObject.nextInt();
        
              
       
        
        totalPrice = prodPrice * prodQuant;  // processing
		System.out.println("Total price:R" +totalPrice);
		
        System.out.print("Enter amount tendered:R");
        amountPaid = myObject.nextInt();
		
	if(amountPaid > totalPrice)
		{
		
        change = amountPaid - totalPrice; // processing
        
		clrscr();
		  
        //output 
			for(int i = 0; i<=2; i++)  //// loop prints inserts 2 blank lines after clearing screen
			System.out.println(""); 
		
		//printLoop(); //method call
			
		System.out.println("---------BAMBAZONKE TUCKSHOP RECIEPT---------");	
		System.out.println("");
        System.out.println("Product name: " +prodName);
        
        System.out.println("Product price:"+"R" +prodPrice);
        System.out.println("Quantity Sold:" +prodQuant);
        System.out.println("Total price:" +"R"+totalPrice);
        System.out.println("Amount paid:"+"R" +amountPaid);
        System.out.println("Your change:"+"R" +change);
        }
		
		else{
			System.out.println("You tendered an amount less than total price of "+"R" +totalPrice);
			System.out.println("Please enter the correct amount");
			       
    }
	
	}
	
	
}