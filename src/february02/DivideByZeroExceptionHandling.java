package february02;

import java.util.Scanner;

public class DivideByZeroExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Ebter a Number");
int x=obj.nextInt();//asking user to enter Int value

int z=0;

System.out.println("Enter another number");
int y=obj.nextInt();

try {
	z=x/y;
} 

catch (Exception e) {
	e.printStackTrace();
	System.out.println("Exception occured:" + e.getMessage());
	z=5;
}
System.out.println("Value of z is" + z);
for (int i=1; i<=5; i++){
		System.out.println(i);
}
}
}
