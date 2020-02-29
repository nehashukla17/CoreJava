package january26;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //C c=new C();// On below Child class of C (c) is ale to access methods of class A and Class B
     // c.dispay();
      //c.show();
      //c.print();
      
     // B b=new B();// On below Child class of B (b) is ale to access methods of class A only
     // b.dispay();
     // b.show();
      
      
		public int sumDouble(int a, int b) {
			  // Store the sum in a local variable
			  int sum = a + b;
			  
			  // Double it if a and b are the same
			  if (a == b) {
			    sum = sum * 2;
			  }
			  
			  return sum;
			}
	}
}
