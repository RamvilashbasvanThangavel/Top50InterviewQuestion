package InterviewQuestions;

import java.util.Scanner;

public class PrimeInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int a = sc.nextInt();
		String b = "Prime";
		for(int i =2;i<a;i++) {
			if(a%i==0) {
				b = "Not Prime";
			}
		}
		System.out.println(a+" is a "+b);
	}

}
