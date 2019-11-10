package by.ad.les09_8.bean;

import java.util.List;
import java.util.ArrayList;

public class CustomerGroup {

	private List<Customer> customerlist;

	public CustomerGroup() {
		customerlist = new ArrayList<Customer>();

	}

	public void setCustomer(Customer customer) {
		customerlist.add(customer);
	}

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public int size() {
		return customerlist.size();
	}

	public Customer get(int i) {
		return customerlist.get(i);
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}

	@Override
	public String toString() {
		return "CustomerList [customerlist=" + customerlist + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerlist == null) ? 0 : customerlist.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerGroup other = (CustomerGroup) obj;
		if (customerlist == null) {
			if (other.customerlist != null)
				return false;
		} else if (!customerlist.equals(other.customerlist))
			return false;
		return true;
	}

}
