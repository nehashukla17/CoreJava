package january12;

public class Execution2 {

	public static void main(String[] args) {
		
		Bike bi=new Bike();
		bi.displayName();//calls first method
		bi.displaySpeed(60);//calls second method
		
        int gears= bi.returnGear();//Third method returns something 
        System.out.println("The number of gear is: " + gears);
     
	}
}
