package week3.day2;

public class MyBank {

	public static void main(String[] args) {

		System.out.println("********Below output for implementation class methods , object created for class**********");

		SBI obj = new SBI();
		obj.openAccount();
		obj.provideCreditCard();
		obj.provideDebitCard();
	
		System.out.println("********Below output for interface methods , object created for interface**********");
		
		
		RBI obj1 = new SBI();
		obj1.openAccount();
		obj1.provideDebitCard();
	}

}
