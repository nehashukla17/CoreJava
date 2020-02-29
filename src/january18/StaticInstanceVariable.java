package january18;

public class StaticInstanceVariable {
int counter=0;//instance variable
static int counter1=0;//class variables

void increment(){
	counter++;
	counter1++;
	this.display();
}
 void display()
 {
	 System.out.println("counter:"  + counter);
	 System.out.println("counter:"  + counter1);
 }

		public static void main(String[] args) {
			StaticInstanceVariable obj3=new StaticInstanceVariable();
			obj3.display();
			obj3.increment();
			obj3.display();
			
			StaticInstanceVariable obj4=new StaticInstanceVariable();
			obj4.display();
			obj4.increment();
			obj4.display();
			
			StaticInstanceVariable obj5=new StaticInstanceVariable();
			obj5.display();
			obj5.increment();
			obj5.display();
			

		}

}