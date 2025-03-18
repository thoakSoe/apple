package collectionframework;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class HashSetTest {
	public static void main (String []args) {
		HashSet set1=new HashSet();
		set1.add("John");
		set1.add("Marry");
		set1.add("David");
		set1.add("Smith");
		set1.add(null);
		
		
		System.out.println(set1);
		
		
		LinkedHashSet<String> set2=new LinkedHashSet<String>();
		set2.add("John");
		set2.add("Marry");
		set2.add("David");  
		set2.add("Smith");
		set2.add(null);
		
		
		System.out.println(set2);
		
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("John");
		set.add("Marry");
		set.add("David");
		set.add("Smith");
		
		
		System.out.println(set);
		
		
		TreeSet<Integer> set3=new TreeSet<Integer>();
		set3.add(4);
		set3.add(1);
		set3.add(3);
		set3.add(2);
		
		System.out.println(set3);
	
	}

}
