package corejava;
import java.util.Scanner;
public class EnumExample3 {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
		}
		public static void main(String args[]) {
			try {
				Scanner s=new Scanner(System.in);
			System.out.print("Enter day :");
			String d=s.next().toUpperCase();
			
		Day day = Day.valueOf(d);
		switch (day) {

		case SUNDAY:
		case SATURDAY:
		System.out.println("Sunday is best");
		break;
		case MONDAY:
		System.out.println("Monday is bad");
		break;
		default:
		System.out.println("Other day are not bad");

		}
		} catch (Exception ex) {
            System.out.println("Invalid day.");
        }

		}

}
