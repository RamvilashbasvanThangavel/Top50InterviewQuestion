package InterviewQuestions;

public class RepeatedlettersFindinginString {
	public static void main(String[] args) {
		String name = "nishanthiii";
		char[] a = name.toCharArray();
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = '0';
				}
			}
			if (count > 1 && a[i] != '0') {
				System.out.println(a[i] + "-" + count);
			}
		}
	}

}
