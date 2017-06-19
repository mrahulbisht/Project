package com.niit.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="supplier")
public class Supplier {

	private String name;
	private String address;
	@Id
	private String id;
	// If the relation is one-to-many we need to use the following

		@OneToMany(mappedBy = "supplier", fetch = FetchType.EAGER)
		private Set<Product> products;
	public Set<Product> getProducts() {
			return products;
		}
		public void setProducts(Set<Product> products) {
			this.products = products;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
