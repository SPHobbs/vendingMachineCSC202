import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class vendingMachine {
	//This is the method that handles the exceptions as well as the printing and stocking of the machine
	
	
	
	
	
	public static void money(){
		//This is the method that handles all the processes that have to do with money
		
	}
	public static void main(String[]args){
		//This method will create the customers and determine the order for which they arrive
		int i=0;
		double time = 0.0;
		
		while(i<50)
		{
			if(time<2000){
				int randomMoney = (int) (10*Math.random());
				int random = (int) (10*Math.random());
				
				int randomMachine = (int) (10*Math.random());
				int randomTime = (int) (100*Math.random());
				int randomSelection= (int) (10*Math.random());
				
				System.out.println("The user has entered $" + randomMoney);
				
				if(randomMachine<5){
					System.out.println("The user has selected the snack machine");
					dispenser.snacksDispenser();
				}
				else{
					System.out.println("The user has selected the drinks machine");
					dispenser.drinksDispenser();
				}
				System.out.println("The time is " + time);
				time += randomTime;
				i++;
			}
			else{
				System.out.println("The machine has shut for the day.")
			}
			
			
		}
		
	}
	public static void printing(){
		//This is the method that handles all the file and text printing
		try {
			PrintStream out = new PrintStream(new FileOutputStream("CustomerReceipt.txt"));
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can not print the receipt");
		}
	}
	
}
