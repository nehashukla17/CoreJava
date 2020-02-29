package february02;

public class FinallyExample {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		//int z=0;
try {
	int z=x/y;	
} 

catch (Exception e) {
	System.out.println("Exception " + e.getMessage());
}

finally {
	System.out.println("I am Finally");
}
	}

}
