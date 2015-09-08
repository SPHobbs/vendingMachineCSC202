import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class vendingMachine {
	//This is the method that handles the exceptions as well as the printing and stocking of the machine
	
	
	
		static int randomMoney = (int) (10*Math.random());
		/*static int random = (int) (10*Math.random());
		static int randomProduct = (int) (10*Math.random());*/
		static int randomMachine = (int) (10*Math.random());
		static int randomTime = (int) (100*Math.random());
		static int randomSelection= (int) (10*Math.random());
	
	
	public static void money(){
		//This is the method that handles all the processes that have to do with money
		
	}
	public static void customer(){
		//This method will create the customers and determine the order for which they arrive
		if(randomMachine<5){
			dispenser.snacksDispenser();
		}
		else{
			dispenser.drinksDispenser();
		}
		
		System.out.println("The user has entered $" + randomMoney);
		
		System.out.println("The user has selected " );
		
		
		
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
