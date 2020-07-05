package functions;

public class CallVariables2 {

	public static void main(String[] args) {
		
		System.out.println(Variable2.name);

		Variable2 ref = new Variable2();

		System.out.println(ref.name2);
		
		
		//Change the value
				Variable2.name = "Sneha";
				ref.name2 = "Neharika";
		
		
		Variable2 ref2 =new Variable2();
		
		//call the variable
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);

		
	

	}

}
