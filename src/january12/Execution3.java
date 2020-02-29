package january12;

public class Execution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewBike pulsar=new NewBike("Pulsar", 60,9 );
		pulsar.displyName();
		pulsar.displySpeed();
		
		int result=pulsar.returnGear();
		System.out.println("The speed of the bike is: " + result);
		
		
		
		
	}

}
