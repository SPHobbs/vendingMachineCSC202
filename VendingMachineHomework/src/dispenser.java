import java.util.Arrays;


public class dispenser {
	
	public static void snacksDispenser(){
		//This method creates the dispenser that will dispense the food item ordered
		String[] foodSlots;
		
		foodSlots = new String[10];
		
		foodSlots[0] = "Chips";
		foodSlots[1] = "Cookies";
		foodSlots[2] = "Snickers";
		foodSlots[3] = "Twix";
		foodSlots[4] = "Sweedish Fish";
		foodSlots[5] = "Twizzlers";
		foodSlots[6] = "Gum";
		foodSlots[7] = "Mints";
		foodSlots[8] = "Peanuts";
		foodSlots[9] = "Pretzels";
	
		System.out.println(Arrays.toString(foodSlots));
	}
	public static void drinksDispenser(){
		//This method creates the dispenser that will dispense the drink item ordered
		String[] drinkSlots;
		
		drinkSlots = new String[10];
		
		drinkSlots[0] = "Coke";
		drinkSlots[1] = "Pepsi";
		drinkSlots[2] = "Powerade";
		drinkSlots[3] = "Gatorade";
		drinkSlots[4] = "Vitamin Water";
		drinkSlots[5] = "Root Beer";
		drinkSlots[6] = "Water";
		drinkSlots[7] = "Coffee";
		drinkSlots[8] = "Juice";
		drinkSlots[9] = "Milk";
			
	}
	
}

