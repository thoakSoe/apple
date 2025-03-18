package collectionframework;

public class GenericContainer<T> {
	T obj;
	public GenericContainer(T obj) {
		this.obj=obj;
	}

	
	public String toString() {
		return obj.toString();	}
	


	public static void main(String[] args) {
		GenericContainer c1=new GenericContainer("apple");
		
		System.out.println(c1);
	}
	
}
