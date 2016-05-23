import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number a:");
		int a = input.nextInt();
		System.out.println("Please enter number b:");
		int b = input.nextInt();
		System.out.println("a is: " + a + ", b is: " + b);
		if (b < a) {
			System.out.println("Please enter b > a");
		} else if (b > a) {
			for (int i = a; i <= b; i++) {
				if (i % 3 == 0) {
					System.out.println(i);
				}
			}
		}
	}
}
