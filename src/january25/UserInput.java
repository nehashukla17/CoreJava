package january25;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);

System.out.println("Enter you name");
String name=obj.nextLine();

System.out.println("Enter your City");
String city=obj.nextLine();

System.out.println("Enter you PinCode");
int PinCode=obj.nextInt();

System.out.println("Hello" + name +"Your City is" + city + "PinCode is " + PinCode);

	}

}
