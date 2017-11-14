package org.cmp;

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
			int i = 0;
			while (i < 3) {
				i++;
				session.beginTransaction();
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				//System.out.println("isbn:");
				int isbn=Integer.valueOf(bf.readLine());
				String bookTitle= bf.readLine();
				
				int bookPrice=Integer.valueOf(bf.readLine());
				int authorId=Integer.valueOf(bf.readLine());
				String firstName= bf.readLine();
				String lastName= bf.readLine();
				int publisherId=Integer.valueOf(bf.readLine());
				String publisherName= bf.readLine();
				long phone= Long.valueOf(bf.readLine());
				Books books = new Books(isbn, bookTitle, bookPrice, authorId, firstName, lastName, publisherId, publisherName, phone)
				System.out.println("Name:" + books.getIsbn());
				System.out.println("Email:" + books.getbBookTitle());
				System.out.println("Phone:" + books.getBookPrice());
				session.save(employee);
				session.getTransaction().commit();
			}
			session.close();
		}
	}