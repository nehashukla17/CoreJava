package january25;

import java.util.Scanner;

public class UserInputPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("Enter a number to check if it's palindrome");
int number= obj.nextInt();
int rev=0;
int temp;
int num=number;
while(num > 0){
	 temp=num%10;
	 rev=(rev*10)+ temp;
	 num=num/10;
}
if(number==rev){
	 System.out.println("Given number is a palindrome");
}
else{
	System.out.println("Given number is not a palindrome");
}
     }
	
}
