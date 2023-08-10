package InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ArrayListToArry {
	public static void main(String[] args) {
		System.out.println("Object to Array");
		List<Object> list1 = Arrays.asList(10, "Employee", 'a', "Details");
		Object[] data = list1.toArray(new Object[list1.size()]);
		for (Object e : data) {
			System.out.println(e);

		}

		System.out.println("\n" + "Integer to Array");

		List<Integer> li = Arrays.asList(10, 20, 30, 40);
		Integer[] da = li.toArray(new Integer[list1.size()]);
		for (Object d : da) {
			System.out.println(d);

		}

	}
}
