package ifElseStatements;

public class ifElseStatementLogicalOperator {

	public static void main(String[] args) {
	
		//AND operator
 int age=25;
 boolean voterID=false;
 
 if(age>=18 && voterID)
	 {
	 System.out.println("you are eligible");
	}
 else
	{
	 System.out.println("you are not eligilbel");
		}
 
 //OR operator
 
 boolean panCard=true;
 boolean aadharCard=true;
 
 if(panCard || aadharCard)
 {
	 System.out.println("you are eligible");
 }
 
 else
 {
	 System.out.println("you are not eligible");
 }
 
 
	}

}
