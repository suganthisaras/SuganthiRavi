package org.dummy.cmp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {

	public Employee() {
		super();
	}

	public Employee(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME", length = 150, nullable = true)
	private String name;
	@Column(name = "EMAIL_ID", unique = true)
	private String email;
	@Column(name = "PHONE", length = 15, unique = true)
	private long phone;
	@Column(name = "BASIC_SALARY")
	private double basicSalary;
	@Column(name = "DA")
	private float dearnessAllowance;
	@Column(name = "HRA")
	private float houseRentAllowance;
	@Column(name = "PF")
	private float providantFund;
	@Column(name = "TA")
	private float travelAllowance;
	@Transient
	private float netSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getProvidantFund() {
		return providantFund;
	}

	public void setProvidantFund(float providantFund) {
		this.providantFund = providantFund;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
