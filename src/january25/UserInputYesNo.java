package january25;

import java.util.Scanner;

public class UserInputYesNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		Scanner objString= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= obj.nextInt();
		checkNumberPalindrome(num);
		
		System.out.println("Do you want to continue ? (Yes/No)");
		String userChoice=objString.nextLine();
		
		while(userChoice.equals("Yes")){
		System.out.println("Enter a Number");
		num=obj.nextInt();
		checkNumberPalindrome(num);
		System.out.println("Do you want to continue ? (Yes/No)");
		userChoice=objString.nextLine();
	    }
	}	
		public static void checkNumberPalindrome(int num)
		{
		int rev=0;
		int temp;
		int number=num;
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