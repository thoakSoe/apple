package superkeyword;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		
		Sedan sedan=new Sedan(50,300000,"black",23);
	
		
		Ford ford1=new Ford(60,200000,"white",2025,20000);

		
		Ford ford2=new Ford(30,500000,"blue",2025,50000);

		
		Car car=new Car(40,400000,"blue");

		
		Truck truck=new Truck(20,100000,"red",2200);

		
		System.out.println(car.getSalePrice());
		System.out.println(truck.getSalePrice());
		System.out.println(ford1.getSalePrice());
		System.out.println(sedan.getSalePrice());
	
	}

}
