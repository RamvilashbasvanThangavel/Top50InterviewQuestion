package InterviewQuestions;

public class IntegerToWordTwentyTwoTo22 {
	public static void main(String[] args) {
		int number = 22;
		String word = convertToWord(number);

		System.out.println(word);
	}

	public static String convertToWord(int number) {
		String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		if (number >= 0 && number < 20) {
			return units[number];
		} else if (number >= 20 && number < 100) {
			int tensDigit = number / 10;
			int unitsDigit = number % 10;
			return tens[tensDigit] + " " + units[unitsDigit];
		} else {
			return "number out of range";
		}

	}
}
