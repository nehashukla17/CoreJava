package february2;

public class NotString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*     String name="pune";//Providing value to the variable and next we are creating the object of the string class
     
     String uppername=name.toUpperCase();
     
     System.out.println(uppername);
     System.out.println(name);*/
		NotString obj=new NotString();//If we would have written ststic on method, then the object creation was not required
		obj.startsWithNot("amol");
		obj.startsWithNot("notmal");		
	}
	
	public void startsWithNot(String value){
		boolean result = value.startsWith("not");
		
		if(result){
			System.out.println("String starts with not : " + value);
		}
		else{
			System.out.println("String does not starts with not : " + value);
			System.out.println("not" + value);
		}		
	}

}
