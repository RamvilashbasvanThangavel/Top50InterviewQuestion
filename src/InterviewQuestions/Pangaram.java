package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Pangaram {
	public static void main(String[] args) {
		String a = "Pack my box with five dozen liquor jugss";
		boolean b = getpangram(a);
		if (b) {
			System.out.println("given sentence is an panagram");
		} else {
			System.out.println("given is not a an panagram");
		}
	}

	public static boolean getpangram(String a) {
		Set<Character> s = new HashSet<>();
		for (Character x : a.toCharArray()) {
			if (Character.isLetter(x)) {
				s.add(x);
			}
		}
		return s.size() == 26;

	}

}
