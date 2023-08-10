package InterviewQuestions;

import java.util.Scanner;

public class MissingNumbersUpto10 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 5, 4 };
		System.out.println("Enter the number upto which you want : ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		for (int i = 1; i <= b; i++) {
			String c = "Missing";
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					c = "Not Missing";
				}
			}
			if (c.equals("Missing")) {
				System.out.println("Missing number: " + i);
			}
		}
	}
}
