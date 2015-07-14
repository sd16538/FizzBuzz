package com.sts03;

public class FizzBuzz {

	private static final int DEFAULT_LIMIT = 100;
	private static final String EMPTY_STRING = "";
	private static final String FIZZ = "fizz";
	private static final String BUZZ = "buzz";
	private final int limit;

	public FizzBuzz() {
		limit = DEFAULT_LIMIT;
	}

	public FizzBuzz(int limit) {
		this.limit = limit;
	}

	public static void main(String... args) {
		FizzBuzz fb = new FizzBuzz();
		fb.processAll();
	}

	public int getLimit() {
		return limit;
	}

	public void processAll() {
		for (int num = 0; num <= limit; num++) {
			System.out.println(process(num));
		}
	}

	protected String process(int number) {
		String result = EMPTY_STRING;
		if (isDivisibleBy3(number)) {
			result += FIZZ;
		}
		if (isDivisibleBy5(number)) {
			result += BUZZ;
		}
		if (result.isEmpty()) {
			result += Integer.toString(number);
		}
		return result;
	}

	private boolean isDivisibleBy3(int number) {
		return (number % 3 == 0);
	}

	private boolean isDivisibleBy5(int number) {
		return (number % 5 == 0);
	}
}
