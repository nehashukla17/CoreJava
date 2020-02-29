package january26;

public class IntMax {
	public int intMax(int a, int b, int c) {
	 int max=0;
		
		if(a>b){
		    max=a;
		  }
		  if(b>c){
		    max=b;
		  }
		  if(c>a){
		    max=c;
		  }
		  return max;
		}
       
}
