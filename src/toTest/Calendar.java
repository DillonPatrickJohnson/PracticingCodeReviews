package toTest;
import java.util.Scanner;

import toTest.Date;

public class Calendar {

	private static Date date = null;
	
	public static void main(String[] args){
		int mm, dd, yyyy;
		boolean validDate = false;

		Scanner scanner = new Scanner(System.in); 
		while (!validDate) {
			if (args.length == 3) {
				mm = Integer.parseInt(args[0]);
				dd = Integer.parseInt(args[1]);
				yyyy = Integer.parseInt(args[2]);
			}
			else {
				System.out.println("Month: ");
				mm = Integer.parseInt(scanner.nextLine());
				System.out.println("Day: ");
				dd = Integer.parseInt(scanner.nextLine());
				System.out.println("Year: ");
				yyyy = Integer.parseInt(scanner.nextLine());
				System.out.println("asdfasdfa");
			}
			
			if(Date.isValidDate(dd, mm, yyyy)) {
				try {
					date = new Date(mm, dd, yyyy);
					validDate = true;
				} catch (Exception e) {
					System.err.println("This is not a valid date...");
				}
			}
			else {
				System.err.println("Please enter a new date that is valid: ");
			}
		}
		System.out.println(date.toString());

		scanner.close();
	}
}
