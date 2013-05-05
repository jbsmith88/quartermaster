/**
 * @author Patrick Gallagher
 */
package com.gallaghersmith.QuarterMaster;

/** 
 * Item class, used to create items to add in the list portion
 * Contains two field variables, the name of the item and the state, 
 * which is stored in an int form.
 * 0 - out of item
 * 1 - running low
 * 2 - means fine
 * @author Patrick Gallagher
 */
public class ListItem {
	
	String itemName;
	int state;
	
	/*
	 * @param - item name
	 * @param - item state
	 * Constructor that creates a ListItem with both the name and the
	 * state of the created item
	 */
	public ListItem(String itemName, int state) {
		this.itemName = itemName;
		this.state = state;
	}
	
	public ListItem(String itemName) {
		this.itemName = itemName;
		this.state = 2;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	

}
