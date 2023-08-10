package InterviewQuestions;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a = "ram";
		String b = "arma";
		if (a.length() == b.length()) {
			char[] a1 = a.toCharArray();
			char[] b1 = b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			// Arrays.equals(a1, b1);
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}
