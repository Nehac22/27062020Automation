package oops.polymorphism;

import oops.inheritence.Mobile;
import oops.inheritence.Smartphone;
import oops.inheritence.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {

		//Smartphone obj = new Smartphone();

		//Mobile obj2 = new Smartphone();

		// Smartphone obj4 =new Mobile();
		// Cannot use refrence of child class for the object of parent class

		
		Telephone obj4; //Webdriver
		
		obj4=new Telephone();
		obj4.calling();
		
		obj4 =new Mobile(); //chrome driver
		obj4.calling();
		
		obj4=new Smartphone(); //firefox driver
		obj4.calling();

		
	}

}
