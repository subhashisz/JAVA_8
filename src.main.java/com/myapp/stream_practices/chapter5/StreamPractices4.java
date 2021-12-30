package com.myapp.stream_practices.chapter5;

import static com.myapp.datas.DataUtils.menu;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.myapp.model.Dish;

public class StreamPractices4 {

	public static void main(String[] args) {
		int calories = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
		int calories1 = menu.stream().mapToInt(Dish::getCalories).sum();

		IntStream intStream = menu.stream().mapToInt(Dish::getCalories);// Stream to IntStream
		Stream<Integer> stream = intStream.boxed();// IntStream to Stream

		OptionalInt maxCalories = menu.stream().mapToInt(Dish::getCalories).max();
		int max = maxCalories.orElse(1);

		IntStream evenNumbers = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0);
		System.out.println(evenNumbers.count());

		// Pythagorean triple a * a + b * b = c * c eg: 3 * 3 + 4 * 4 = 5 * 5 or 9+ 16 = 25.
		// the square root of a * a + b * b is an integer number; that is, it has no fractional part
		//filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)

	}

}
