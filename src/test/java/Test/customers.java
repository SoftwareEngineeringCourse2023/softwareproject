package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sources_code.Customersteps;

public class customers {
	Customersteps c ;
	@Given(": id,name,phone and address")
	public void id_name_phone_and_address() {
	   c = new Customersteps();
	}
	
	@When("the customer give id , name , phone and address")
	public void the_customer_give_id_name_phone_and_address() {
		
		System.out.println("enter id =");
		Scanner  input2 = new Scanner(System.in);
		 int idd=input2.nextInt();  
	

		  System.out.println("\nenter name =");
		  input2 = new Scanner(System.in);
			String name =input2.next();
			
			 System.out.println("\n enter phone =");
			  input2 = new Scanner(System.in);
			int phone =input2.nextInt();
				
		
				 System.out.println("\n enter address =");
				  input2 = new Scanner(System.in);
					String address =input2.next();
					
		c.mylist.add(new Customersteps(idd,name,phone,address));
		System.out.println("\n successfull to save information");
		c.setissave(true);
		  }
		
		
	@Then("successfull to save information")
	public void successfull_to_save_information() {
	   assertTrue(c.getissave() == true);
	}
	
	@Then("Failed to save information")
	public void failed_to_save_information() {
		 assertFalse(c.getissave() == false);
	}

}
