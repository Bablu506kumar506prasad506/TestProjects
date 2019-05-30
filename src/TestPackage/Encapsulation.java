package TestPackage;

class Student {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Bablu Kumar Prasad");
		System.out.println(s.getName());

	}

}

// Other Method to create fully encapsulated class

class Encaptesting {
	private String Name;
	private String Address;
	private int Age;

	// Get the data
	public String getName() {
		return Name;
	}

	public String getAddress() {
		return Address;
	}

	public int getAge() {
		return Age;
	}

	// Set the data
	public void setName(String name) {
		this.Name = name;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public void setAge(int age) {
		this.Age = age;
	}

}

class EncapMain {
	public static void main(String args[]) {
		Encaptesting encp = new Encaptesting();

		encp.setName("Bablu Kumar");
		encp.setAddress("Banjara Hills Road No. 3 Hyderabad");
		encp.setAge(27);

		System.out.println("Name: " + encp.getName());
		System.out.println("Age: " + encp.getAge());
		System.out.println("Address: " + encp.getAddress());
	}
}
