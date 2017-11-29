package com.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1.Insert  2.Display  3.Update  4.Delete");
			int ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1:
				session.beginTransaction();
				Book book = new Book();
				System.out.println("Enter the Book Title:");
				book.setTitle(bf.readLine());
				System.out.println("Enter the author name:");
				book.setAuthor(bf.readLine());
				System.out.println("Enter the price:");
				book.setPrice(Double.valueOf(bf.readLine()));
				System.out.println("Enter the ISBN Number:");
				book.setIsbn(bf.readLine());
				session.save(book);
				session.getTransaction().commit();
				System.out.println("item saved");
				break;
			case 2:
				Book book1 = session.get(Book.class, 1);
				System.out.println("Title" + book1.getTitle());
				System.out.println("Author" + book1.getAuthor());
				System.out.println("Price" + book1.getPrice());
				System.out.println("ISBN" + book1.getIsbn());
				break;
			case 3:
				session.beginTransaction();
				Book book2 = new Book();
				book2.setId(1);
				book2.setAuthor("author");
				book2.setPrice(250.50);
				session.update(book2);
				session.getTransaction().commit();
				break;
			case 4:
				session.beginTransaction();
				Book book3 = new Book();
				book3.setId(2);
				session.delete(book3);
				session.getTransaction().commit();
				break;
			default:
				break;
			}
			session.close();
			sf.close();
		}
	}
}
