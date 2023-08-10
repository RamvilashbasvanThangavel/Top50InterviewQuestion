package InterviewQuestions;

public class RemovalOf1 {
	public static void main(String[] args) {
		String a = "abc123def";
		String b = a.substring(0, 3);
		String c = a.substring(4, 6);
		String d = a.substring(6, 9);
		System.out.println(d + c + b);

	}
}
