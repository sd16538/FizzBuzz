package com.sts03;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTester {

	private FizzBuzz fizzbuzz = new FizzBuzz();

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
