package february2;

import java.util.Scanner;

public class PrintReverseString {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter some String");
        String value=obj.nextLine();//String Method
        reverseString(value);
	}	
	
static void reverseString(String input){
		String reverse="";
		int length=input.length();
		for(int i=length-1; i>=0; i--){
		reverse=reverse + input.charAt(i);
		}
		System.out.println("Reverse of " + input +  " is: " + reverse);
}
	}
