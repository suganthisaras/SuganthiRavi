package com.book;

//@Entity
public class PaperBook extends Book {
	private float shippingWeight;
	private int inStock;

	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaperBook(int id, String title, String author, double price, String isbn) {
		super(id, title, author, price, isbn);
		// TODO Auto-generated constructor stub
	}

	public float getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(float shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

}
