package oops.abtraction;

public class BankUser {

	public static void main(String[] args) {
		
		account(new SBI());     //SBI==Chrome
		account(new HDFC());   //HDFC=Firefox
		account(new ICICI());  //ICIC=Edge

	}

	public static void account(RBI bank) //RBI==WebDriver
	{

		bank.creditcard();//Navigate
		bank.debitCard(); //Click
		bank.savingAccount();//Enter data
		bank.currentAccount(); //Select option

	}

	//public static void sum(int a) 
	//{
		//System.out.println(10 + a);
	//}

	//public static void message(String name) {
		//System.out.println("Your name is " + name);
	//}

}
