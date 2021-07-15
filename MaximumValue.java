package bridgelabz;
import java.util.Scanner;
public class MaximumValue <T extends Comparable<T>> {
	T p, q, r;

	public T maximum() {
		return MaximumValue.maximum(p, q, r);
	}
	 public static <T extends Comparable<T>> T maximum(T p, T q, T r) {
		if (q.compareTo(p) > 0) {
			if (q.compareTo(r) > 0) {
				 T max = q;
				System.out.println("Maximum value :"+max);
				return max;
			}
			return q;
		}
		if (r.compareTo(p) > 0) {
			if (r.compareTo(q) > 0) {
				T max = r;
				System.out.println("Maximum value :"+max);
				return max;
			}
			return r;
		}
		else {
			 T max = p;
			System.out.println("Maximum value :"+max);
			return max;
		}
	}
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
		
		numMaximumInt();
		numMaximumFloat();
		numMaximumString();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First Number:");  
		Float pFl = sc.nextFloat();
		System.out.print("Enter your Second Number:");
		Float qFl = sc.nextFloat();
		System.out.print("Enter your Third Number:");
		Float rFl = sc.nextFloat();
		
		System.out.print("Enter your First Number:");  
		Integer pInt = sc.nextInt();
		System.out.print("Enter your Second Number:");
		Integer qInt = sc.nextInt();
		System.out.print("Enter your Third Number:");
		Integer rInt = sc.nextInt();
		
		System.out.print("Enter your First Number:");  
		String pStr = sc.nextLine();
		System.out.print("Enter your Second Number:");
		String qStr = sc.nextLine();
		System.out.print("Enter your Third Number:");
		String rStr = sc.nextLine();
		
		maximum(pInt, qInt, rInt);
		maximum(pFl, qFl, rFl);
		maximum(pStr, qStr, rStr);
	
		
	}
}
