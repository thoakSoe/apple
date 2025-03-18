package collectionframework;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
	
	String pdCode;
	String pdName;
	double pdPrice;
	
	public Product(String pdCode,String pdName, double pdPrice) {
		this.pdCode=pdCode;
		this.pdName=pdName;
		this.pdPrice=pdPrice;
	}
	public String toString() {
		return pdCode+pdName+pdPrice;
	}

	public static void main(String[]args) {
		Product p1=new Product("200","Coca",1200);
		Product p2=new Product("201","Sprite",1200);
		Product p3=new Product("202","Pepsi",1200);
		Product p4=new Product("203","RedBull",1200);
		Product p5=new Product("204","Burn",1200);
		
		Map<String,Product> map=new HashMap<>();
		map.put("1", p1);
		map.put("2", p2);
		map.put("3", p3);
		map.put("4", p4);
		map.put("5", p5);

		Scanner s= new Scanner(System.in);
		System.out.print("Enter pdCode : ");
		String scode=s.nextLine();

		Product code=map.get(scode);
		
		if(code!= null) {
			System.out.println(code.getPdCode()+code.getPdName()+code.getPdPrice());
			
		}else {
			System.out.println("no product");
		}
	
	}
}
