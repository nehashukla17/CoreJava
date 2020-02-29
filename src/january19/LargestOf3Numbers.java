package january19;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		
		if(x>y && x>z){
			System.out.println("The greater among 3 numbers is: " + x);
		}
		else if(y>z){
			System.out.println("The greater among 3 numbers is: " + y);
		}
		else{
			System.out.println("The greater among 3 numbers is: " + z);
		}
		

	}

}
