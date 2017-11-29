package com.book;

//@Entity
public class Ebook extends Book {
	private String downloadUrl;
	private int sizeInMb;

	public Ebook(String downloadUrl, int sizeInMb) {
		super();
		this.downloadUrl = downloadUrl;
		this.sizeInMb = sizeInMb;
	}

	public Ebook(int id, String title, String author, double price, String isbn) {
		super(id, title, author, price, isbn);
		// TODO Auto-generated constructor stub
	}

	public Ebook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public int getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(int sizeInMb) {
		this.sizeInMb = sizeInMb;
	}

}
