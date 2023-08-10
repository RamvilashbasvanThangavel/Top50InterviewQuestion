package InterviewQuestions;

public class a1b2c4 {
	public static void main(String[] args) {
		String a = "a1b2c4";
		for (int i = 0; i < a.length(); i++) {
			if (Character.isAlphabetic(a.charAt(i))) {
			} else {
				int num = Character.getNumericValue(a.charAt(i));
				for (int j = 0; j < num; j++) {
					System.out.print(a.charAt(i - 1));
				}
			}
		}
	}

}
