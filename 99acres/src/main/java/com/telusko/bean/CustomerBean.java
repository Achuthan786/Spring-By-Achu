package com.telusko.bean;


// CustomerBean is a POJO here
//  ViewCustomersjsp la line no 17 (<td>${emp.customerId}</td>) -> line no 14 (int customerId) in that jsp we are taking the value from here 
// SO Getter & Setter has its own importance 
//  refer : https://www.javatpoint.com/this-keyword ( this keyword will show the get and set's importance)


public class CustomerBean {
	private int CustomerId;
	private String CustomerName;
	private String CustomerArea;
	private int CustomerContactNo;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerArea() {
		return CustomerArea;
	}
	public void setCustomerArea(String customerArea) {
		CustomerArea = customerArea;
	}
	public int getCustomerContactNo() {
		return CustomerContactNo;
	}
	public void setCustomerContactNo(int customerContactNo) {
		CustomerContactNo = customerContactNo;
	}
	
	
}
