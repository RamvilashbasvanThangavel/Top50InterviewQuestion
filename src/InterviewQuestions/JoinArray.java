package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class JoinArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 6, 2, 3, 5 };
		List<Integer> data = new ArrayList();
		for (Integer da : a) {
			data.add(da);
		}
		for (Integer db : b) {
			data.add(db);
		}
		List<Integer> result = data.stream().sorted().distinct().toList();
		System.out.println(result);
	}

}
