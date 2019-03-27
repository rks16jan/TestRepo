package com.cdi.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BussinesUnit {

	private List<String> merchant;
	private Set<String> items;
	private Map<Integer, String> noOfShop;
	private Properties shopRegNo;
	
	

	/**
	 * @return the merchant
	 */
	public List<String> getMerchant() {
		return merchant;
	}



	/**
	 * @param merchant the merchant to set
	 */
	public void setMerchant(List<String> merchant) {
		this.merchant = merchant;
	}



	/**
	 * @return the items
	 */
	public Set<String> getItems() {
		return items;
	}



	/**
	 * @param items the items to set
	 */
	public void setItems(Set<String> items) {
		this.items = items;
	}



	/**
	 * @return the noOfShop
	 */
	public Map<Integer, String> getNoOfShop() {
		return noOfShop;
	}



	/**
	 * @param noOfShop the noOfShop to set
	 */
	public void setNoOfShop(Map<Integer, String> noOfShop) {
		this.noOfShop = noOfShop;
	}



	/**
	 * @return the shopRegNo
	 */
	public Properties getShopRegNo() {
		return shopRegNo;
	}



	/**
	 * @param shopRegNo the shopRegNo to set
	 */
	public void setShopRegNo(Properties shopRegNo) {
		this.shopRegNo = shopRegNo;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BussinesUnit [merchant=" + merchant + ", items=" + items + ", noOfShop=" + noOfShop + ", shopRegNo="
				+ shopRegNo + "]";
	}
	
	
	
}
