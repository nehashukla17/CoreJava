package january12;

public class Execution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodExample obj=new MethodExample();
		
		obj.display("Pune");
		obj.display("Radical");
		
		obj.add(10, 20);//Here only the method gets called , value gets returned but no one is holding 
		
		int result = obj.add(10,20);// Here the result variable is holding what the method returned
		System.out.println(result);
	}

}
