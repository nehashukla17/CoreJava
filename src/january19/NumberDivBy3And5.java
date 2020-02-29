package january19;

public class NumberDivBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("No Div by 3 are:-");
		for(int x=1; x<=100; x++){
    	 if(x%3==0){
    		 System.out.print(x + ",");
    	           }
		}
		
		System.out.println("\nNo Div by 5 are:-");
		for(int x=1; x<=100; x++){
			if(x%5==0){
				System.out.print(x + ",");
			}
		}
		
		System.out.println("\nNo Div by 5 and 3 are:-");
		for(int x=1; x<=100; x++){
			if(x%3==0 && x%5==0){
				System.out.print(x + ",");
			}
		}
		
	}
	}

	

   	 
    
    	
