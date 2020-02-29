package january12;

public class NewBike {
String name;
int speed;
int gears;

NewBike(String iName,int iSpeed, int iGears)
{
	name=iName;
	speed=iSpeed;
	gears=iGears;
}
void displyName(){
	System.out.println("The name of the bike is "+ name);
}

void displySpeed(){
	System.out.println("The speed of the bike is "+ speed);
}

int returnGear(){
	return gears;
}
}
