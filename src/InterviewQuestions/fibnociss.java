package InterviewQuestions;

public class fibnociss {
	public static void main(String[] args) {
		int num = 10;
		int a = 0, b = 1, c = 1;
		int count = 0;
		for (int i = 0; i < num; i++) {
			System.out.println(a);
			count = count + a;
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println("Count of fibnocii = " + count);
	}

}
