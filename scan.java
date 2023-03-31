package Tasks;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your a String ");
		String b = scan.nextLine();
		System.out.print("Enter your b String ");
		String c = scan.nextLine();
		String d = b + "" + c;
		System.out.println(d);
		scan.close();
	}

}
