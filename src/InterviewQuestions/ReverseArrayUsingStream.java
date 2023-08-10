package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayUsingStream {
	public static void main(String[] args) {
		int[] a = {2,5,8,6,1,4};
		List<Integer> data = new ArrayList<>();
		for(Integer d : a) {
			data.add(d);
		}
		System.out.println(data);
		List<Integer> d = data.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println(d);
	}
}