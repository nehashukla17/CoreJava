package january19;

public class SwitchEx {
	
	public static void main(String[] args) {
		
int day=3;
//String day="Monday";

switch(day){//Switch needs an expression 
case 1:System.out.println("Sunday");//Type of input should always match the type of case/condition (3=case 3)
break;
case 2:System.out.println("Monday");
break;
case 3:System.out.println("Tuesday");
//break;
default: System.out.println("Enter some valid input");
}
//System.out.println("I will be printed");
}

}
