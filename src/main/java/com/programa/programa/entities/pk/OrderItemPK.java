package com.programa.programa.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.programa.programa.entities.Order;
import com.programa.programa.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable //for many keys
public class OrderItemPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	// this class is for primary key for both classes "Order and Product";
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order Order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product produtc;

	public Order getOrder() {
		return Order;
	}

	public void setOrder(Order order) {
		Order = order;
	}

	public Product getProdutc() {
		return produtc;
	}

	public void setProdutc(Product produtc) {
		this.produtc = produtc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Order, produtc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(Order, other.Order) && Objects.equals(produtc, other.produtc);
	}

}
