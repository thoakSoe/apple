package a;

public class Emp {
	
	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");
		Address address2=new Address("gno","UP","india");
		Employee e1=new Employee(111,"varun",address1);
		Employee e2=new Employee(112,"arun",address2);
		e1.display();
		e2.display();
	}

}
