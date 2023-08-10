package InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUsingInbuiltmethods {
	public static void main(String[] args) {
		String name = "Ramvilash";
		String a = name.toLowerCase();
		char[] b = a.toCharArray();
		Arrays.sort(b);
		System.out.println(b);

		System.out.println("\n" + "Sorted with arrays");
		String[] data = { "Ram", "Deva", "Sinthya" };
		List<String> d = Arrays.asList(data);
		d.stream().sorted().forEach(x -> System.out.println(x));

		System.out.println("\n" + "Sorted with length arrays");
		d.stream().sorted(Comparator.comparing(x -> x.length())).forEach(x -> System.out.println(x));

	}

}
