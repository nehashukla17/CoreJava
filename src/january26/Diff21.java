package january26;

public class Diff21 {
	public int diff21(int n) {
	
	int result=0;
	
	if(n<=21){
		result=21-n;
	}
	else{
		result=2*(21-n);
	}
    return result; 
}
}

