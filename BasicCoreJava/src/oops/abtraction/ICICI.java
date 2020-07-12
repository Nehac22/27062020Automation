package oops.abtraction;

public class ICICI implements RBI
{

	@Override
	public void savingAccount() 
	{
	System.out.println();	
		
	}

	@Override
	public void currentAccount()
	{
	
		System.out.println("ICCI curent account");
	}

	@Override
	public void debitCard() 
	{
	System.out.println("ICCI debit card");
		
	}

	@Override
	public void creditcard()
	{
	System.out.println("ICCI credit card");
		
	}

}
