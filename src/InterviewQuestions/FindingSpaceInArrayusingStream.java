package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindingSpaceInArrayusingStream {
	public static void main(String[] args) {
		String[] a = {"Ram"," "," "," ","","Muthu"};
		List<String> data = new ArrayList<>();
		for(String b : a) {
			data.add(b);
		}
		long c = data.stream().filter(x->x.isBlank()).count();
		System.out.println(c);
	}

}
