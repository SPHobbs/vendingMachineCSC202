import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class vendingMachine {
	//This is the method that handles the exceptions as well as the printing and stocking of the machine
	static int snacksDispensed=0;
	static int drinksDispensed=0;
	static int totalMoney=0;
	
	public static void main(String[]args){
		//This method will create the customers and determine the order for which they arrive
		System.out.println("the machine has turned on for the day");
		
		//int snacksDispensed=0;
		//int drinksDispensed=0;
		//int totalMoney=0;
		
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
				totalMoney+=randomMoney;
				
				if(randomMachine<5){
					System.out.println("The user has selected the snack machine");
					snacksDispensed+=1;
					dispenser.snacksDispenser();
				}
				else{
					System.out.println("The user has selected the drinks machine");
					drinksDispensed+=1;
					dispenser.drinksDispenser();
				}
				System.out.println("The time is " + time);
				for(int j=0;j<3;j++){
					System.out.println();
				}
				time += randomTime;
				i++;
			}
			else{
				System.out.println("The machine has shut off for the day.");
				
				break;
			}
			
			
		}
		
	}
	public static void printing(){
		//This is the method that handles all the file and text printing
		try {
			PrintStream out = new PrintStream(new FileOutputStream("CustomerReceipt.txt"));
				out.println("The total number of snacks dispensed were " + snacksDispensed);
				out.println("The total number of drinks dispensed were " + drinksDispensed);
				out.println("The total amount of money deposited into the machine is " + totalMoney);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can not print the receipt");
		}
	}
	
}
