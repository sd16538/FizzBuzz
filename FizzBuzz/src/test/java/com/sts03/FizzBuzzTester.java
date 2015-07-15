package com.sts03;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTester {

	private final FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void shouldReturnFizzBuzzWhenNegative_And_DivisibleBy_3_And_5() {
		String result = fizzbuzz.process(-15);
		assertThat(result, equalTo("fizzbuzz"));
	}

	@Test
	public void shouldReturnNegativeNumberWhenNotDivisibleBy_3_Or_5() {
		String result = fizzbuzz.process(-2);
		assertThat(result, equalTo("-2"));
	}

	@Test
	public void shouldReturnZeroWhenNotDivisibleBy_3_Or_5() {
		String result = fizzbuzz.process(0);
		assertThat(result, equalTo("0"));
	}

	@Test
	public void shouldReturnNumberWhenNotDivisibleBy_3_Or_5() {
		String result = fizzbuzz.process(4);
		assertThat(result, equalTo("4"));
	}

	@Test
	public void shouldReturnFizzWhenDivisibleBy_3_AndNotBy_5() {
		String result = fizzbuzz.process(6);
		assertThat(result, equalTo("fizz"));
	}

	@Test
	public void shouldReturnBuzzWhenDivisibleBy_5_AndNotBy_3() {
		String result = fizzbuzz.process(10);
		assertThat(result, equalTo("buzz"));
	}

	@Test
	public void shouldReturnFizzBuzzWhenDivisibleBy_3_AndBy_5() {
		String result = fizzbuzz.process(15);
		assertThat(result, equalTo("fizzbuzz"));
	}
}
