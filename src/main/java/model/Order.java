package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order {
	@Id
	private String order_id;
	private String address;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	public Order() {

	}

	public Order(String order_id, String address, Customer customer) {

		this.order_id = order_id;
		this.address = address;
		this.customer = customer;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
