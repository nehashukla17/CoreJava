package codingBat;

public class SleepIn {

	public static void main(String[] args) {
		
		SleepIn sleep=new SleepIn();
		System.out.println(sleep.sleepInMeth(false,false));
		System.out.println(sleep.sleepInMeth(true, false));
		System.out.println(sleep.sleepInMeth(false, true));
		//System.out.println(sleepInMeth(false, true));
		
	}
		
	public static boolean sleepInMeth(boolean weekday, boolean vacation) {
			if(!weekday || vacation){
				
				return true;
		}
	return false;
}
}
