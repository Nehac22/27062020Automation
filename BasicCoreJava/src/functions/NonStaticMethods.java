package functions;

public class NonStaticMethods {

	public  String name="Neha";
	
	
	
	public static void main(String[] args) {
        //reference            //object
		NonStaticMethods obj = new NonStaticMethods();
		
		System.out.println(obj.name);
	}

}
