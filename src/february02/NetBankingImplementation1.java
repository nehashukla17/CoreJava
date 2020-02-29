package february02;

public abstract class NetBankingImplementation1 implements NetBanking {//Class always Implements an Interface
 public void setUsername(){
	 System.out.println("You can set your user name");
 }
 public void neft(){
	 System.out.println("You can use NEFT");
 }
 public void electricity(){
	System.out.println("You can pay electricity"); 
 }
 public void gaspayment(){
	 System.out.println("You can pay gas bills");
 }
}

//Abstract is being used as we wanted to use only some methods
