package corejava;
import java.util.Scanner;
public class CharacterCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter character : ");
		char ch=s.next().charAt(0);
		
//		int value = (int)ch;
		
		if(ch>='A' && ch<='Z') {
			System.out.println(ch+" is capital letter.");
		}else if(ch>='a'&& ch<='z') {
			System.out.println(ch+" is small letter.");
		}else if(ch>='0' && ch<='9') {
			System.out.println(ch+" is digit.");
		}else {
			System.out.println(ch+" is special symbol.");
		}
        
//        if (value >= 65 && value <= 90) {
//            System.out.print(ch+" is a capital letter.");
//        } else if (value >= 97 && value <= 122) {
//            System.out.print(ch+" is a small letter.");
//        } else if (value >= 48 && value <= 57) {
//            System.out.print(ch+" is a digit.");
//        } else if ((value >= 0 && value <= 47) || 
//                   (value >= 58 && value <= 64) || 
//                   (value >= 91 && value <= 96) || 
//                   (value >= 123 && value <= 127)) {
//            System.out.print(ch+" is a special symbol.");
//        } else {
//            System.out.print(ch+" is not in the ASCII values.");
//        }
//        
	}

}
