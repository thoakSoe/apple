package b;

public class Dog extends Animal{

	//String color="black";
	
		public Dog() {
			
		}
		
		public Dog(String color) {		
			super(color);
		}
		
		void display() {
			System.out.println("color : "+color);
			System.out.println("super color : "+super.color);
		}
		
		public static void main(String[] args) {
			
			
			Dog d = new Dog("black");
			d.display();
			
		}
}
