package com.gwt.kyu.shared;

import java.util.ArrayList;

public class Customer {

	private String customerName;
	private String customerID;
	private String customerSurname;
	private String customerMail;
	private String customerBranch;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	public String getCustomerBranch() {
		return customerBranch;
	}

	public void setCustomerBranch(String customerBranch) {
		this.customerBranch = customerBranch;
	}

	public ArrayList<Customer> addPersonList() {

		Customer customer;

		ArrayList<Customer> Customer_temp = new ArrayList<Customer>();

		for (int i = 1; i < 6; i++) {

			customer = new Customer();

			customer.setCustomerID("100" + (i));

			customer.setCustomerName("Name" + i);

			customer.setCustomerSurname("Surname" + i);

			customer.setCustomerMail("N" + i + "S" + i + "@gmail.com");

			Customer_temp.add(customer);

		}

		return Customer_temp;

	}

}
