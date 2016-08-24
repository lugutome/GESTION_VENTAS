package model;

import java.util.Date;

public class Order {
	Long ordId;
	String ordNumber;
	Customer customer;
	Date ordDate;
	
	public Long getOrdId() {
		return ordId;
	}
	public void setOrdId(Long ordId) {
		this.ordId = ordId;
	}
	public String getOrdNumber() {
		return ordNumber;
	}
	public void setOrdNumber(String ordNumber) {
		this.ordNumber = ordNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	
}
