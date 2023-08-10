package InterviewQuestions;

public class prime2 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int c=0;
		for (int i = 0; i < a.length; i++) {
			String b = "Prime";
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					b = "Not Prime";
				}
					}
			System.out.println(a[i] + " is a " + b);
		}
	}

}
