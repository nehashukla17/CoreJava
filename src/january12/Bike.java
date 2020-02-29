package january12;

public class Bike {
	
	void displayName()//Question -> Why are we not using public??
	{
		System.out.println("The name of the bike is LML");	
	}
	
	void displaySpeed(int speed)//This methods take the input of integer type	
	{
		System.out.println("The maximum speed is: " + speed);		
	}
	
	int returnGear()//This method returns // Since this is also a method why are we not using void??
	
	{
		int gear=4;
		return gear;
	}

}
