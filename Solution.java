package org.dummy.cmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ID:");
		int id = Integer.valueOf(bf.readLine());
		System.out.println("Name:");
		String name = bf.readLine();
		System.out.println("Email:");
		String email = bf.readLine();
		System.out.println("Phone:");
		long phone = Long.valueOf(bf.readLine());
		System.out.println("Gender:");
		boolean gender = Boolean.valueOf(bf.readLine());
		Employee employee = new Employee(id, name, email, phone, gender);
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("Email:" + email);
		System.out.println("Phone:" + phone);
		System.out.println("Gender:" + gender);
	}
}
