package by.ad.les09_8.logic;
import by.ad.les09_8.bean.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.ad.les09_8.bean.Customer;

public class CustomerListLogic {

	public void compare(CustomerGroup customerlist1) {
		
		
		Comparator<Customer> com = new Comparator<Customer>() {
			public int compare(Customer c1, Customer c2) {
				int compare = c1.getFio().compareTo(c2.getFio());
				return compare;
			}

		};
		
		List <Customer> customerList2=customerlist1.getCustomerlist();
		Collections.sort(customerList2, com);

		
		  for (Customer c : customerList2) { System.out.println(c); }
		 
		
		

	}
	 public void getCustNum (int n, int m, CustomerGroup customerlist1) {
		  
		  
		  for (int i = 0; i < customerlist1.size(); i++) { Customer
		  c=customerlist1.get(i);
		  
		  if (c.getCardnumber() < n && c.getCardnumber() > m) { System.out.println(c);
		  } }
		  
		  }
}
