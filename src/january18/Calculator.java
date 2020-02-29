package january18;

public class Calculator {
	int x;
	int y;
		
	Calculator(int X, int Y){
		this.x= X;
		this.y= Y;	
	}
	void add(){
		System.out.println("Addition is: " + (x+y));	
		}
	void sub(){
		System.out.println("Substraction is: " + (x-y));	
		}
	void mul(){
		System.out.println("Multiplication is: " + (x*y));	
		}
	void div(){
		System.out.println("Division is: " + (x/y));	
		}
	}
