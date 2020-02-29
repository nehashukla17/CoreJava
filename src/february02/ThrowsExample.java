package february02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) throws FileNotFoundException {
		openFile("abc.txt");
	}
	
/*try {
	openFile("abc.txt");
} 

catch (FileNotFoundException e) {
	
	e.printStackTrace();
}
	}*/
	
	public static void openFile(String path) throws FileNotFoundException{
		File fh=new File(path);
		FileInputStream io= new FileInputStream(fh);
	}
	
	public void myException(String browserName) throws Exception{
		if(browserName.equals("Chrome")){
	System.out.println("Browser Chrome");
	}
		else{
			throw new Exception("Invalid Browser name");//We are giving a value "Invalid Browser name" to the constructor 
		}
}
}
