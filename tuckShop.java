package snake;
import java.util.*;
import java.io.*;



 public class  tuckShop {
	 public static void main(String[]args) {
		 
		 tuckShop n = new tuckShop();
		 n.getClass();
		 		 
		 n.tuckshop();
		 n.getItems();
		 n.getPayment();
		
	 }
	 String prodName;
     int prodPrice, prodQuant, totalPrice;
     int amountPaid, change;
     
	public void  tuckshop(){
		
		for(int i = 0; i<=20; i++)
			System.out.print("***");
			System.out.println("");
			System.out.println("       ---------WELCOME TO BAMBAZONKE TUCKSHOP-------------");
		for(int i = 0; i<=20; i++)
			System.out.print("***");
			System.out.println("");
	}
		
	public static void reciept(){
		for(int i = 0; i<=20; i++)
			System.out.print("***");
			System.out.println("");
			System.out.println("       ---------BAMBAZONKE TUCKSHOP RECIEPT-------------");
		for(int i = 0; i<=20; i++)
			System.out.print("***");
			System.out.println("");
	}
	
public void  getItems(){
	Scanner myObject = new Scanner(System.in);
	System.out.print("Enter product name: ");
    prodName = myObject.nextLine();
    System.out.print("Enter product price:R");
    prodPrice = myObject.nextInt();
    System.out.print("Enter quantity sold: ");
    prodQuant = myObject.nextInt();
		
	}
public void  getPayment(){
	Scanner myObject = new Scanner(System.in);
    totalPrice = prodPrice * prodQuant;  // processing
	System.out.println("Total price:R" +totalPrice);
	
    System.out.print("Enter amount tendered:R");
    amountPaid = myObject.nextInt();
	
if(amountPaid > totalPrice)
	{
	
    change = amountPaid - totalPrice; // processing
    
	
	  
    //output 
		for(int i = 0; i<=2; i++)  //// loop prints inserts 2 blank lines after clearing screen
		System.out.println(""); 
	
	reciept(); //method call
		
	//System.out.println("---------BAMBAZONKE TUCKSHOP RECIEPT---------");	
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

	 


