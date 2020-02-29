package january12;

public class Execution {

	public static void main(String[] args) {
	//Creating a new object always calls a constructor 
      Student amol5=new Student("Amol", 123, "COEP", "Machenical");
      amol5.attendsLecture();
      
      
      Student rashmi5 = new Student("Rashmi" ,222, "Electrical");
      rashmi5.appearsForExam();
      rashmi5.attendsLecture();
      
      String result=rashmi5.returnName();
      System.out.println(result);     
	}
}
