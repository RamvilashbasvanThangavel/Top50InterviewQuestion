package InterviewQuestions;

public class AmstrongnumberFinding {
	public static void main(String[] args) {
		int a = 153;
		String b = String.valueOf(a);
		char[] c = b.toCharArray();

		int temp2 = 0;
		for (int i = 0; i < c.length; i++) {
			int temp = 1;
			for (int j = 0; j < c.length; j++) {
				temp = temp * (c[i] - '0');
			}
			temp2 = temp2 + temp;
			// System.out.println(temp);
		}
		if (temp2 == a) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}

}
