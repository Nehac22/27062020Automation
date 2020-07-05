package functions;

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(10, 20);
		sum(20, 30);
		sum(40, 50);
		sum(10, 20, 30);
		message("Neha");
		eligibility("Anand", 32);
		eligibility("Neha", 17);

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void message(String name) {
		System.out.println("Welcome " + name);
	}

	public static void eligibility(String name, int age) {
		if (age > 18) {

			System.out.println("Anand you are eligible");
		} else

		{
			System.out.println("Neha you are not eligible");
		}

		
		
		
	}
}
