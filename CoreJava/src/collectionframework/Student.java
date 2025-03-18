package collectionframework;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student{
	private String id;
	private String name;
	private int age;
	
	public Student(String id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
        return "Student(id=" + id + ", name=" + name + ", age=" + age + ")";
}


	public static void main(String[] args) {
		Student s1=new Student("100","Mg Mg",20);
		Student s2=new Student("101","Kyaw Kyaw",19);
		Student s3=new Student("102","Hla Hla",23);
		Student s4=new Student("103","Mya Mya",18);
		Student s5=new Student("104","Kaung Kaung",21);
		
		List <Student>lst=new ArrayList<>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		lst.add(s5);
		
		for(Student student:lst) {
			if(student.getAge()<20) {
				System.out.println(student);
				
			}
		}
	
	List <Student>lst1=new LinkedList<>();
	lst1.add(s1);
	lst1.add(s2);
	lst1.add(s3);
	lst1.add(s4);
	lst1.add(s5);
	
	for(Student student1:lst1) {
		if(student1.getAge()>20) {
			System.out.println(student1);
			
		}
	}
	
}

}
