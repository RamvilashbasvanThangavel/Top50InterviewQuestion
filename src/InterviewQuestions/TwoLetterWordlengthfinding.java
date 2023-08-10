package InterviewQuestions;

public class TwoLetterWordlengthfinding {
	public static void main(String[] args) {
		String a = "This is id card";
		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			if (b[i].length() == 2) {
				System.out.println(b[i]);
			}
		}
	}

}
