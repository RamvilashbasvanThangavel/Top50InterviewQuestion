package InterviewQuestions;

public class ReverseUsingFor {
	public static void main(String[] args) {
		String a = "amma";
		String[] b = a.split(" ");
		for (int i = b.length - 1; i >= 0; i--) {
			//System.out.print(b[i] + " ");
		}
		StringBuffer data = new StringBuffer(a);
		StringBuffer c =data.reverse();
		System.out.println(c);
	}

}
