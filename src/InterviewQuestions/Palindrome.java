package InterviewQuestions;

public class Palindrome {
	public static void main(String[] args) {
		String a = "RamaR";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			b = b + a.charAt(i);
		}
		if (b.equals(a)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
