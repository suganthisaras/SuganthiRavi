package org.dummy.cmp;

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
			System.out.println("Name:");
			String name = bf.readLine();
			System.out.println("Email:");
			String email = bf.readLine();
			System.out.println("Phone:");
			long phone = Long.valueOf(bf.readLine());
			Employee employee = new Employee(name, email, phone);
			System.out.println("Name:" + employee.getName());
			System.out.println("Email:" + employee.getEmail());
			System.out.println("Phone:" + employee.getPhone());
			session.save(employee);
			session.getTransaction().commit();
		}
		session.close();
	}
}
