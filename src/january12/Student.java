package january12;

public class Student {
	//Variable declaration
	String name;
	int id;
	String collegeName;
	String department;
	
Student(String iname, int iid, String icollege, String idepartment)//Constructor

{ // Variable Assignment. To the name variable we are assigning the value which comes inside iname
	name=iname;
	id=iid;
	collegeName=icollege;
	department=idepartment;
}
	
Student(String iname, int iid, String idepartment) 
	
{
	name=iname;
	id=iid;
	department=idepartment;
	collegeName="Dhole Patil";	
}

void attendsLecture(){
	System.out.println( name + " attends lecture ");
}

void appearsForExam(){//Method minimum requires return type and name
	System.out.println( name + " attends exam with id " + id);
}

void studiesInDepartment(){
	System.out.println( name + " studies in department " + department);
}

void studiesInCollege(){
	System.out.println( name + "studies in college " + collegeName);
}
String returnName()//this method is giving us the return type not void
{
	return name;
}
}
	
