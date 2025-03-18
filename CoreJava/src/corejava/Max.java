package corejava;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 10;
		int value2 = 20;
		int value3 = 15;
		
		int max = (value1< value2)? value1 : value2;
		
		String result= (max < value3)? "The maximum value is "+ max : "The maximum vlaue is "+ value3;
		
		System.out.println(result);
		
//		nested ternary ;
//		int max = (value1 > value2) ? ((value1 > value3) ? value1 : value3) : ((value2 > value3) ? value2 : value3);

//		System.out.println("The maximum value is: " + m);


	}

}
