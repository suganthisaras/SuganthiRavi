package org.cmp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "BOOKS_STORE")
public class Books {

	public Books() {
		super();
	}

	public Books(int isbn, String bookTitle, int bookPrice, int authorId, String firstName, String lastName,
			int publisherId, String publisherName, long phone) {
		super();
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.authorId = authorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.phone = phone;
	}

	@Id
	@GeneratedValue
	@Column(name = "ISBN")
	private int isbn;
	@Column(name = "BOOK_TITLE")
	private String bookTitle;
	@Column(name = "BOOK_PRICE")
	private int bookPrice;
	@Column(name = "AUTHOR_ID")
	private int authorId;
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	@Column(name = "PUBLISHER_ID")
	private int publisherId;
	@Column(name = "PUBLISHER_NAME")
	private String publisherName;
	@Column(name = "PHONE")
	private long phone;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	/*
	 * public static void main(String[] args) { Employee employee = new
	 * Employee(); System.out.println("Object1");
	 * System.out.println(employee.getId());
	 * System.out.println(employee.getName());
	 * System.out.println(employee.getEmail());
	 * System.out.println(employee.getPhone());
	 * System.out.println(employee.isGender());
	 * 
	 * employee.setId(2); employee.setName("sugu");
	 * employee.setEmail("suganthi@gmail.com"); employee.setPhone(9895464424L);
	 * employee.setGender(true);
	 * 
	 * System.out.println("Object1"); System.out.println(employee.getId());
	 * System.out.println(employee.getName());
	 * System.out.println(employee.getEmail());
	 * System.out.println(employee.getPhone());
	 * System.out.println(employee.isGender());
	 * 
	 * Employee employee1 = new Employee();
	 * System.out.println(employee1.getId());
	 * System.out.println(employee1.getName());
	 * System.out.println(employee1.getEmail());
	 * System.out.println(employee1.getPhone());
	 * System.out.println(employee1.isGender());
	 * 
	 * employee1.setId(3); employee1.setName("anisha");
	 * employee1.setEmail("anisha@gmail.com"); employee1.setPhone(9547864424L);
	 * employee1.setGender(true);
	 * 
	 * System.out.println(employee1.getId());
	 * System.out.println(employee1.getName());
	 * System.out.println(employee1.getEmail());
	 * System.out.println(employee1.getPhone());
	 * System.out.println(employee1.isGender());
	 * 
	 * }
	 */
}