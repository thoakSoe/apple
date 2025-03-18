package collectionframework;

import java.util.ArrayList;
import java.util.List;
import corejava.Employee;
import java.util.LinkedList;

public class ArrayListTest {
	
	public static void main(String[]args) {
		List lst=new ArrayList();
		lst.add(1);
		lst.add('c');
		lst.add(true);
		lst.add(2.3);
		lst.add("Java");
		
		System.out.println(lst);
		
		lst.add(new Employee());
		System.out.println(lst);
		System.out.println(lst.get(1));
		
		double number=(double) lst.get(3);
		
		List<String> languages=new ArrayList<String>();
		languages.add("java");
		//languages.add(1);
		String value=languages.get(0);
		
		
		LinkedList list=new LinkedList();
		list.add(1);
		list.add('c');
		list.add(true);
		list.add(2.3);
		list.add("Java");
		
		System.out.println(list);
		
		double num=(double) list.get(3);
		
		List<String>list1=new LinkedList<String>();
		list1.add("John");
		list1.add("Marry");
		list1.add("David");
		list1.add("Smith");
		
		System.out.println(list1);
		String name=list1.get(3);
	}

}
