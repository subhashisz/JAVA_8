package com.myapp.stream_practices.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.myapp.datas.DataUtils.menu;

public class StreamPractices3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		int sum1 = numbers.stream().reduce(0, Integer::sum);
		Optional<Integer> sum2 = numbers.stream().reduce((a, b) -> (a + b));

		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		Optional<Integer> max = numbers.stream().reduce(Integer::max);

		/**
		 * How would you count the number of dishes in a stream using the map and reduce
		 * methods?
		 */

		int countNoOfDishes = menu.stream().map(d -> 1).reduce(0, (a, b) -> a + b);
		long countNoOfDishes1 = menu.stream().count();
		//System.out.println(countNoOfDishes + " " + countNoOfDishes1);
		// mutable accumulator pattern is a dead end for parallelization

		numbers.stream().map(x -> x + x).forEach(System.out::print);

	}

}
