package january18;

public class Car {
	String name;//Instance variable
	String color;
	int year;
	
	
	Car(String iName, String iColor, int iYear){
		name=iName;//Local variable
	    color=iColor;
	    year=iYear;
	}
	void displayDetails(){
		System.out.println("The name of the car is: " + name);
		System.out.println("The color of the car is: " + color);
		System.out.println("The year of car make is: " + year);
		
	}
	void changeGear(int gearNumber){
		System.out.println("Changing to gear number " + gearNumber);
	}
	
	int accelerte(){
		int speed=20;//speed is a local variable
		return speed;
	}
	
	static void applyBrakes(){//If a method is static then object creation is not required to access method
		System.out.println("Returning spees..............");
	}
	
	

		public static void main(String[] args) {
			Car obj=new Car("Baleno", "Blue", 2019);
			obj.displayDetails();
			obj.changeGear(6);
			int speed=obj.accelerte();
			System.out.println("Accelerting speed by : " + speed + " km/hr ");
			Car.applyBrakes();//The method which is not static can be called by the class name
		}
}

