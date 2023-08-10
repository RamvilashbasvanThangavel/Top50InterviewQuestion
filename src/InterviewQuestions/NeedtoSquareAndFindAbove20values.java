package InterviewQuestions;

public class NeedtoSquareAndFindAbove20values {
	public static void main(String[] args) {
		int[] a = { 1, 8, 5, 2, 4, 6 };
		int b = 1;
		for (int i = 0; i < a.length; i++) {
			b = a[i] * a[i];
			if (b >= 20) {
				System.out.println(b);
			}
		}

	}

}
