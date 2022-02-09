/**
 * 
 */
package com.lti.application;

import java.util.Scanner;

import com.lti.business.CustomerBusiness;

/**
 * @author user207
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* create the instance of the business class*/
		CustomerBusiness cb = new CustomerBusiness();
		int id;
		String name, address;
		Scanner scanner = new Scanner(System.in);
		int end = 0;
		
		while(end==0){
			System.out.println("Select an option:\n1. Create new customer" +
					"\n2. Update existing customer" +
					"\n3. Delete a customer" +
					"\n4. List all customer details" +
					"\n5. End");
			int option = scanner.nextInt();
			
			switch (option) {
			case 1:
				cb.createCustomer();
				break;
			case 2:
				cb.updateCustomer();
				break;
			case 3:
				cb.deleteCustomer();
				break;
			case 4:
				cb.listCustomers();
				break;
			case 5:
				System.out.println("Thanks for using the system!");
				end=1;
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}
		
		
		
	}

}
