package bridgelabz;
import java.util.Scanner;
public class MaximumValue {
	 static void numMaximumInt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Number:");  
		Integer a = sc.nextInt();
		System.out.print("Enter your Second Number:");
		Integer b = sc.nextInt();
		System.out.print("Enter your Third Number:");
		Integer c = sc.nextInt();

		if (b.compareTo(a) > 0) {
			if (b.compareTo(c) > 0) {
				Integer max = b;
				System.out.println("Maximum value is b:"+max);
			}
		}
		if (c.compareTo(a) > 0) {
			if (c.compareTo(b) > 0) {
				Integer max = c;
				System.out.println("Maximum value is c:"+max);
			}
		}
		else {
			 Integer max = a;
			System.out.println("Maximum value is a:"+max);
		}
	}
	 static void numMaximumFloat() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your First Number:");  
			Float a = sc.nextFloat();
			System.out.print("Enter your Second Number:");
			Float b = sc.nextFloat();
			System.out.print("Enter your Third Number:");
			Float c = sc.nextFloat();

			if (b.compareTo(a) > 0) {
				if (b.compareTo(c) > 0) {
					Float max = b;
					System.out.println("Maximum value is b:"+max);
				}
			}
			if (c.compareTo(a) > 0) {
				if (c.compareTo(b) > 0) {
					Float max = c;
					System.out.println("Maximum value is c:"+max);
				}
			}
			else {
				 Float max = a;
				System.out.println("Maximum value is a:"+max);
			}
		}
	 static void numMaximumString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Number:");  
		String a = sc.nextLine();
		System.out.print("Enter your Second Number:");
		String b = sc.nextLine();
		System.out.print("Enter your Third Number:");
		String c = sc.nextLine();

		if (b.compareTo(a) > 0) {
			if (b.compareTo(c) > 0) {
				String max = b;
				System.out.println("Maximum value is b:"+max);
			}
		}
		if (c.compareTo(a) > 0) {
			if (c.compareTo(b) > 0) {
				String max = c;
				System.out.println("Maximum value is c:"+max);
			}
		}
		else {
			 String max = a;
			System.out.println("Maximum value is a:"+max);
		}
	} 
	public static void main(String[] args) {
		System.out.println("Welcome to Generic Problem");
		
		MaximumValue  value = new MaximumValue ();
		value.numMaximumInt();
		value.numMaximumFloat();
		value.numMaximumString();
	}
}
