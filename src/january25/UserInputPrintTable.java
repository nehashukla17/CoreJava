package january25;

import java.util.Scanner;

public class UserInputPrintTable {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number to display maths table");
int number= obj.nextInt();

for(int i=1; i<=10; i++){
	System.out.println( number + " X " + i + " = "  + i*number);
}
	}

}
