package january19;

public class IfElseEx {

	public static void main(String[] args) {
		int x=9;
		int y=10;
		int z=11;
		
		/*if(x%2==0){
			System.out.println("The number is Even");
		}
		else{
			System.out.println("The number is Odd");
		}*/
		
		if(x>y && x>z){
			
		System.out.println("x is greater");
		}
		
		else if(y>z){
			System.out.println("y is greater");
		}
		else{
			System.out.println("z is greater");	
		}

	}

}
