package january19;

public class First100PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1; num<=100; num ++){
	    int count=0;
	    for(int i=1; i<=num ; i++){
	    	if(num%1==0){
	    		count ++;
	    	}
	    }
		if(count==2){
			System.out.println("Number is Prime");
		}
		//else{
		//	System.out.println("Number is not Prime");
		//}
	}

}
}
