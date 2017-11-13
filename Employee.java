package org.dummy.cmp;

public class Employee {

	
	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, long phone, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
	}

	private int id;
	private String name;
	private String email;
	private long phone;
	private boolean gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	/*public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Object1");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getPhone());
		System.out.println(employee.isGender());

		employee.setId(2);
		employee.setName("sugu");
		employee.setEmail("suganthi@gmail.com");
		employee.setPhone(9895464424L);
		employee.setGender(true);

		System.out.println("Object1");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getEmail());
		System.out.println(employee.getPhone());
		System.out.println(employee.isGender());

		Employee employee1 = new Employee();
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getPhone());
		System.out.println(employee1.isGender());

		employee1.setId(3);
		employee1.setName("anisha");
		employee1.setEmail("anisha@gmail.com");
		employee1.setPhone(9547864424L);
		employee1.setGender(true);

		System.out.println(employee1.getId());
		System.out.println(employee1.getName());
		System.out.println(employee1.getEmail());
		System.out.println(employee1.getPhone());
		System.out.println(employee1.isGender());

	}*/
}
