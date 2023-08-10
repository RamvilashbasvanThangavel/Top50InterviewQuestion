package InterviewQuestions;

import java.util.Scanner;

public class JaDeveloperVa {
	public static void main(String[] args) {
		System.out.println("Enter the string value of a : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Enter the string value of b : ");
		Scanner sc1 = new Scanner(System.in);
		String b = sc1.nextLine();
		
//		String a = "Java";
//		String b = "Developer";
		int c = a.length() / 2;
		System.out.println(a.substring(0, c).concat(b) + a.substring(c, a.length()));
	}

}
