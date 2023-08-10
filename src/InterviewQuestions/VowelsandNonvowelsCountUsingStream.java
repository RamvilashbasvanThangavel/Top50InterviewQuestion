package InterviewQuestions;

public class VowelsandNonvowelsCountUsingStream {
	public static void main(String[] args) {
		String a = "Ramvilash";

		long vowels = a.chars().mapToObj(x -> (char) x).filter(x -> "AEIOUaeiou".contains(x.toString())).count();
		long nonvowels = a.length() - vowels;
		System.out.println("Count of vowels " + vowels);
		System.out.println("Count of Non vowels " + nonvowels);
	}
}