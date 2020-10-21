package ecommerce;
import java.util.*;
public class Amazon {
	public static void main(String[] args) {
		String name,address;
		long phone_number,pin;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		 name=sc.nextLine();
		 System.out.println("Enter address");
		 address=sc.nextLine();
		 System.out.println("Phone number");
		 phone_number=sc.nextLong();
		 System.out.println("Enter pin");
		 pin=sc.nextLong();
		 Customer C1=new Customer(name,address,pin,phone_number );
		 C1.print();
		 sc.close();
	}

}
