package TestPackage;

public abstract class AbstractClass1 {
		
	private String Name;
	private String Address;
	private int Ids;
	
	public AbstractClass1(String name, String address, int ids) {
		System.out.println("Constructing an Employee");
		System.out.println(this.Name +"  "+ this.Address+"  "+ this.Ids+"  "+ "Constructing an Employee");
		
		this.Name = name;
		this.Address = address;
		this.Ids = ids;
	}
	
	public String toString() {
		return Name+"  "+Address+"  "+Ids;
		
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String NewName) {
		Name = NewName;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void SetAddress(String newAddress) {
		Address = newAddress;
	}
	
	public int getIds() {
		return Ids;
	}
	
	public void setIds(int newIds) {
		Ids = newIds;
	}

//	public static void main(String[] args) {
//		
//		AbstractClass1 abs = new AbstractClass1("Bablu", "Hyderabad",01);
//
//	}

}

class Salary extends AbstractClass1 {
	private double salary;

	public Salary(String name, String address, int ids, double salary) {
		super(name, address, ids);
		
		setSallery(salary);
	}
	 public double getSalary() {
	      return salary;
	   }

	private void setSallery(double Salarys) {
		if(Salarys >= 0.0) {
	         salary = Salarys;
	      }		
	}
	
}


