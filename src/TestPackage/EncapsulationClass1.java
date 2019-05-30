package TestPackage;


/* File name : EncapTest.java */
public class EncapsulationClass1 {

	public static void main(String[] args) {
		EncapTest ob = new EncapTest();
		ob.setId(01);
		ob.setName("Bablu");
		ob.setAddress("Hyderabad");
		
		System.out.println("Id :"+ ob.getId()+", Name :" +ob.getName()+ ", Address :" + ob.getAddress()+",");
		
	}

}


class EncapTest{
	private String name;
	private String address;
	private int id;
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	
	public void setId(int newId){
		id = newId;
	}
	public void setName(String newNAme){
		name = newNAme;
	}
	public void setAddress(String newaddress){
		address = newaddress;
	}
}