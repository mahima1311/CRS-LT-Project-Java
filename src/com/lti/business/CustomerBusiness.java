/**
 * 
 */
package com.lti.business;

import java.util.Scanner;

import com.lti.bean.Customer;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author user207
 *
 */
public class CustomerBusiness {
	/*Define the business methods in this class*/
	
	Customer customers[] = new Customer[10];
	int count = 0;
	Scanner scanner = new Scanner(System.in);
	
	public void createCustomer(){
		
		System.out.println("Enter ID");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name");
		String name = scanner.nextLine();
		System.out.println("Enter address");
		String address = scanner.nextLine();
		
		customers[count] = new Customer();
		customers[count].setCustomerID(id);
		customers[count].setCustomerName(name);
		customers[count].setCustomerAddress(address);
		
		count++;
		
		System.out.println("Customer created");
	}
	
	public void deleteCustomer(){
		System.out.println("Enter ID to remove");
		int id = scanner.nextInt();
		int j=0;
		Customer newCustomer[] = new Customer[count-1];
		for(Customer cust: customers){
			if (cust!=null && cust.getCustomerID()!=id) {
				newCustomer[j++] = cust;
			}
		}
		customers = newCustomer;
		count--;
		System.out.println("Customer deleted");
	}
	
	public void updateCustomer(){
		
		System.out.println("Enter ID of existing customer to edit");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter new name");
		String name = scanner.nextLine();
		System.out.println("Enter new address");
		String address = scanner.nextLine();
		int flag = 0, i=0;
		
		while(flag==0){
			if(customers[i].getCustomerID()==id){
				customers[i].setCustomerName(name);
				customers[i].setCustomerAddress(address);
				flag=1;
			}
			else
				i++;
		}
		System.out.println("Customer updated");
	}
	
	public void listCustomers(){
		System.out.println("Here's the list of customers.");
		if(count==0){
			System.out.println("No customers");
		}
		else {
			for(Customer cust: customers){
				if(cust!=null){
					System.out.println("details -> "+cust.getCustomerID()+" "+cust.getCustomerName()+" "+cust.getCustomerAddress());
					
				}
				
			}
			
		}
		System.out.println("\n");
		
	}
}
