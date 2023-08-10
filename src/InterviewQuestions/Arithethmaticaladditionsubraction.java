package InterviewQuestions;

public class Arithethmaticaladditionsubraction {
	public static void main(String[] args) {
		String val = "2-1+3";
		String[] a = val.split("[+-]");
		String[] b = val.split("\\d+");
		int num = Integer.parseInt(a[0]);
		for (int i = 0; i < a.length; i++) {
			if (b[i].equals("+")) {
				num = Integer.parseInt(a[i]);
			} else {
				num = Integer.parseInt(a[i]);
			}
		}
		System.out.println(num);
	}

}
