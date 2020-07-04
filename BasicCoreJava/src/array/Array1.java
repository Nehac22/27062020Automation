package array;

public class Array1 {

	public static void main(String[] args) {

		String[] std = new String[10];
		std[0] = "Neha";
		std[1] = "Sneha";
		std[2] = "Ashwini";
		std[3] = "Anand";
		std[4] = "Puja";
		std[5] = "Nitu";
		std[6] = "Dhara";
		std[7] = "Pratik";
		std[8] = "Prachi";
		std[9] = "Bilwa";

		System.out.println(std.length);

		for (int i = 0; i<std.length; i++) {
			System.out.println(std[i]);
		}
	}
}
