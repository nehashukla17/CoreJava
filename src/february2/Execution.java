package february2;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B b=new B();
		 b.add(10, 20);//Here B uses the method of its latest class B
		 b.sub();//Here B uses the method of its parent class A, since the sub() method is not newly implemented 
		 b.div();//Here B uses the method of its parent class A, since the div() method is not newly implemented 
		 
		 A a=new A();
		 a.add(20, 10);
	}

}
