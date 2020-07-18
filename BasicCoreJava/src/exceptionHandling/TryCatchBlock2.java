package exceptionHandling;

public class TryCatchBlock2 {
	public static Functions fun;
	// = new Functions();

	public static void main(String[] args) {

		try {
			// Step 1: Verify about link is present
			int a = 10;
			int b = 2;
			System.out.println(a / b);

			// Step 2: Verify Downloads link is present

			String[] str = new String[2];
			str[1] = "Anand";

			// step 3:Verify Projects link is present
			fun.fun1();

		} catch (ArithmeticException e)

		{
			System.out.println("ArithmeticException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e)

		{
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (NullPointerException e)

		{
			System.out.println("NullPointerException: " + e.getMessage());
		}

		catch (Exception e)

		{
			System.out.println("Unknown Exception Occure: " + e.getMessage());
		}
	}
}
