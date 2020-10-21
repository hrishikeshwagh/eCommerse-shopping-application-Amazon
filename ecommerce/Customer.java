package ecommerce;
import java.util.*;
public class Customer {
	private String name,address;
	private long phone_number,pin;
	
	 Customer( String name,String address,long pin ,long phone_number )
	{
		this.name= name;
		this.address= address;
		this.phone_number=phone_number;
		this.pin= pin;
		//System.out.println("name- "+this.name +"Address " +this.address + "phone no "+phone_number+" pin "+this.pin);	
	}
	
	
	void print()
	{
		System.out.println("name:- "+this.name +"\nAddress:- " +this.address + "\nphone no:- "+phone_number+" \npin:- "+this.pin);
	}

}
