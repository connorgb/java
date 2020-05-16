package booklearning;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		problem();
		
	}

	public static void problem19() {
		int a, n;
		Scanner in = new Scanner(System.in);
		System.out.println("I can compute the year in which your nth birthday will occur or has occurred");
		System.out.println("Enter your birthday below:");
		a = in.nextInt();
		System.out.println("Enter n:");
		n = in.nextInt();
		System.out.println("The year in which your nth birthday will occur is " + (a + n) );
		in.close();
	}
	
	public static void problem29() {
		int a, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers, separated by two spaces:");
		a = in.nextInt();
		n = in.nextInt();
		System.out.println("You entered " + a + " and " + n);
		in.close();
	}
}
