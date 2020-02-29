package january26;

public class CalExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCalcualtor cal=new NewCalcualtor();
		cal.add(10, 20);//With one object we are accessing the methods of the parent and the child class
		cal.add(50, 10, 60);
		//Child class object is accessing the methods of the parent class
		Calculator pcal=new Calculator();
		pcal.div(20, 10);
	}

}
