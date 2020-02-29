package january12;

public class Car{
	String name;
	String colour;
	int year;//Instance Variable

Car(String name, String iColour, int iYear) {
	//String iColour -> Local Variables
	
	this.name=name;
	colour=iColour;
	year=iYear;	
}
	void displayDetails(){
		System.out.println( name + " " + colour + " " +  year);
	}
	void changeGear(int gearNumber){
		System.out.println("The gear number is " + gearNumber);
	}
	int applyBreak(){
		//System.out.println("Speed reached after Applying Break is: " + speed);
		//return speed;
		int speed=40;
		return speed;//return speed is returning the speed 40 with it and goes int speed/34 the line and get assigned to speed variable
		
	}
public static class Execution4 {

	public static void main(String[] args) {
		Car obj=new Car("Baleno", "Blue", 2019);
		obj.displayDetails();
		obj.changeGear(6);
		int speed=obj.applyBreak();
		System.out.println("Speed reached after Applying Break is: " + speed);
		
		

	}
}
}
