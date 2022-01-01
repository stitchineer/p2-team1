package com.p2.model.deletewhendone;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude="orders")
@Entity
@Table(name = "ordercontents")
public class OrderContents {
	@Id
	private int orderContentsId;
	@Column
	private int orderID;
	@Column
	private int quantity;
	@Column
	private String item;
	@Column
	private double price;
	
	@ToString.Exclude
	private Orders orders;

	public OrderContents(int quantity, String item, double price, Orders orders ) {
		super();
		this.quantity = quantity;
		this.item = item;
		this.price = price;
		this.orders = orders;
	}

	public OrderContents(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	
	public OrderContents(int quantity, String item, double price) {
		super();
		this.quantity = quantity;
		this.item = item;
		this.price = price;
	}
	
	public Orders getOrders() {
		return this.orders;
	}
	
	public void setOrders(Orders orders) {
		this.orders = orders;
	}

}