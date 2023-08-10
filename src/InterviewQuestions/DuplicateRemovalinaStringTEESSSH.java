package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemovalinaStringTEESSSH {
	public static void main(String[] args) {
		String[] a = { "t", "e", "e", "s", "s", "s", "h" };
		List<String> ch = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			ch.add(a[i]);
		}
		String compressedString = ch.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
				.stream().map(entry -> entry.getKey() + (entry.getValue() >= 1 ? entry.getValue() : ""))
				.collect(Collectors.joining());

		System.out.println("Output: " + compressedString);
	}
}
