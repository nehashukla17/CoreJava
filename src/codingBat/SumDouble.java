package codingBat;

public class SumDouble {

	public static void main(String[] args) {
		SumDouble sd=new SumDouble();
		System.out.println(sd.sumDouble(4, 5));
		System.out.println(sd.sumDouble(4, 4));
		
	}

	public int sumDouble(int a, int b) {
		 int sum=a+b;
		 
		 if(a!=b){
			 return sum;
		 }
		 if (a==b){
			 return (2*sum);
		 }
		 
		 return sum;
	}
}
