package functions;

public class ReturnType {

	public static void main(String[] args) {
		
     int add=sum(10,20);
     System.out.println(add);
     
     boolean c =eligible(30);
     
     System.out.println(c);
     if(c) 
     {
    	System.out.println("you are eligible"); 
     }
     else
     {
    	 System.out.println("You are not eligible");
     }
	}

	
	public static int sum(int a , int b)
	{
		return a+b;
	}
	
	public static boolean eligible(int age)
	{
		if(age>=18)
		{
			return true;
		}
			else
			{
				return false;
				
			}
		}
	}

