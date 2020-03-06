package com.example.springpostgre.api.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Table(name = "Items")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private String itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "item_stock")
	private int itemStock;
	
	@Column(name = "item_description")
	private String itemDescription;
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Item(String itemName, int itemStock, String itemDescription) {
		super();
		this.itemName = itemName;
		this.itemStock = itemStock;
		this.itemDescription = itemDescription;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemStock=" + itemStock + ", itemDescription="
				+ itemDescription + "]";
	}
	
	
	
}
