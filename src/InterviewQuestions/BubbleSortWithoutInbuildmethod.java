package InterviewQuestions;

public class BubbleSortWithoutInbuildmethod {
	public static void main(String[] args) {
		int[] a = { 1, 5, 4, 6, 8, 10 };
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (temp > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);

		}
		for (Integer b : a) {
			// System.out.println(b);
		}

		// System.out.println("Highest value in the Array = " + a[0]);

	}
}
