
public class foodInfo {
	
	public static void decision(){
	}
	public static void snacksInfo(){
		//This method will display the food info
		String[] info;
		
		info = new String[10];
		
			info[0] = "100 cal, 5g fat, 2g sugar";
			info[1] = "150 cal, 10g fat, 4g sugar";
			info[2] = "50 cal, 3g fat, 1g sugar";
			info[3] = "75 cal, 5g fat, 3g sugar";
			info[4] = "110 cal, 7g fat, 5g sugar";
			info[5] = "100 cal, 5g fat, 2g sugar";
			info[6] = "150 cal, 10g fat, 4g sugar";
			info[7] = "100 cal, 5g fat, 2g sugar";
			info[8] = "150 cal, 10g fat, 4g sugar";
			info[9] = "100 cal, 5g fat, 2g sugar";
			
			
			int randomInfo = (int) (10*Math.random());
			System.out.println(info[randomInfo]);
			
			cost.snacksCost();
			
	}
}
