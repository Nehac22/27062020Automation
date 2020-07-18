package exceptionHandling;

public class TryCatchBlock {

	public static Functions fun = new Functions();

	public static void main(String[] args) {

		try {
			// Step 1: Verify about link is present
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (Exception e) {

			System.out.println("Exception Occure: " + e.getMessage());

		}

		// Step 2: Verify Downloads link is present
		
		try {
		String[] str = new String[2];
		str[2] = "Anand";
		}catch(Exception e)
		{
			System.out.println("Exception Occured:"+e.getMessage());
		}
		
		// step 3:Verify Projects link is present
		fun.fun1();

	}

}
