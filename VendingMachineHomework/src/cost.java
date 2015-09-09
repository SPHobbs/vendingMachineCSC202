
public class cost {
	
	
	
	public static void snacksCost(){
		//This method will display the cost of the item selected by the user
		String[] cost;
		cost = new String[10];
		
			cost[0] = ".50";
			cost[1] = "1.00";
			cost[2] = "1.50";
			cost[3] = "2.00";
			cost[4] = ".50";
			cost[5] = "1.00";
			cost[6] = "1.50";
			cost[7] = "2.00";
			cost[8] = ".50";
			cost[9] = "1.00";
			
			int randomMoney = (int) (10*Math.random());
			System.out.println("The cost of the selection is "+ cost[randomMoney]);
			
	}
	
	
	
}
