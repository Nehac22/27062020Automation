package functions;

public class Function1 {

	public static void main(String[] args) {
		
		//Call a function
		sum();

	}
	
	//public          //Static                    //Void                              
	//private         //No Keyword(Non static)    //any datatype(primitive +Non-primitive)     //Anything except          //any datatype(primitive+Non_primitive)
	//protected                                                                                //reserved keyword        
    //
	//Access Modifier //Nature of your method     //Return Type                               //name of your method       //parameters
	public                static                   void                                       sum                          ( )
	{
	 int a=10;
	 int b=20;
	 
	 System.out.println(a+b);
	 
	 int c=30;
	 System.out.println(b+c);
	 
	 int d=40;
	 int e=50;
	 System.out.println(d+e);
	}
	
	
}
