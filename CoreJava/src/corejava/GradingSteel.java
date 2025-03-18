package corejava;
import java.util.Scanner;
public class GradingSteel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter hardness : ");
		double h=s.nextDouble();
		System.out.print("Enter carbon : ");
		double ca=s.nextDouble();
		System.out.print("Enter tensile : ");
		double t=s.nextDouble();
		
		if(h>50 && ca<0.7 && t>5600) {
			System.out.print("Grade is 10.");
		}
		else if(h>50 && ca<0.7) {
			System.out.print("Grade is 9.");
		}
		else if(ca<0.7 && t>5600) {
			System.out.print("Grade is 8.");
		}
		else if(h>50 && t>5600) {
			System.out.print("Grade is 7.");
		}
		else if(h>50 || ca<0.7 || t>5600) {
			System.out.print("Grade is 6.");
		}
		else {
			System.out.print("Grade is 5.");
		}
		s.close();
	}

}
