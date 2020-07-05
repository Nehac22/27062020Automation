package functions;

public class CallVaribles {

	public static void main(String[] args) {

		System.out.println(Variables.name);

		Variables ref = new Variables();

		System.out.println(ref.name2);

		//Change the value
		Variables.name = "Ajinkiya";
		ref.name2 = "Aniket";
         
		//Create a new object
		Variables ref2 = new Variables();

		//call the variable
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);

	}

}
