package booklearning;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		ch4e5();
		
	}

	public static void ch1p19() {
		
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
	
	public static void ch1p29() {
		
		int a, n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers, separated by two spaces:");
		a = in.nextInt();
		n = in.nextInt();
		System.out.println("You entered " + a + " and " + n);
		in.close();
		
	}
	
	public static void ch2p4() {
		
		int x, y;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a 4 digit number:");		
		x = in.nextInt();
		y = x / 1000;
		x = x % 1000;
		System.out.println(y);
		y = x / 100;
		x = x % 100;
		System.out.println(y);
		y = x / 10;
		x = x % 10;
		System.out.println(y);
		y = x % 10;
		System.out.println(y);
				
	}
/*
	public static void ch2p5() {
		
		String x;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a 4 digit number:");
		x = in.next();
		System.out.println(x.charAt(0));
		x.deleteCharAt(0);
		System.out.println(x.charAt(0));
		x.delete(0);		
		System.out.println(x.charAt(0));
		x.delete(0);
		System.out.println(x.charAt(0));
	}
*/
	
	public static void pi() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter number of terms");
        double i = input.nextDouble();
        double sum = 0;
        for(i=0; i<10000; i++){
        	if(i%2 == 0)
        		sum += -1 / ( 2 * i - 1);
        	else
        		sum += 1 / (2 * i - 1);
        	}
        System.out.println(sum);
			
	}
	
	public static void ch3e3() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Score: ");		
		String x = in.next().
				   toLowerCase(); // redundant
			if (x.equalsIgnoreCase("y") || x.equalsIgnoreCase("yes")) {
				System.exit(0);
			} else {
				System.out.println("incorrect input");
			}
			
	}


	public static void ch4e1a() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("dfdgfd: ");		
		String x = in.next();
		while (x != "done") {
			int xl = x.length();
			if (x.charAt(0) == x.charAt(x.length()-1)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			x = in.next();
		}
		
	}
	
	public static void ch4e1b() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("dfdgfd: ");		
		String x = in.next();
		do {
			int xl = x.length();
			if (x.charAt(0) == x.charAt(x.length()-1))
				System.out.println("Yes");
			else
				System.out.println("No");
			x = in.next();
		} while (x != "done");
		
	}
	
	public static void ch4e5() {
		// this doesn't make any sense
		int s = 7;
		int t = 7;
		for (int i = 0; i < 10; i++) {
			s = s + i;
			System.out.println("T is not " + t);
			for (int j = i; j > 0; j--) {
				t = t * (j - i);
				System.out.println("T is also not " + t);
			}
			s = s * t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);
	}
		
	
}