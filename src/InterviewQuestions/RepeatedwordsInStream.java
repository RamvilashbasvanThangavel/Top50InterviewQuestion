package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedwordsInStream {
	public static void main(String[] args) {
		String a = "This is nisha and This is my laptop";
		String[] b = a.split(" ");

		System.out.println("duplicates Removed ");
		List<String> data1 = Arrays.asList(b).stream().distinct().toList();
		System.out.println(data1);

		System.out.println("duplicates Values");
		List<String> data = Arrays.asList(b);
		Set<String> dup = new HashSet<String>();
		Set<String> duplicate = data.stream().filter(x -> !dup.add(x)).collect(Collectors.toSet());
		System.out.println(duplicate);

	}
}
