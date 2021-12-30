package com.myapp.stream_practices.chapter5;

import static com.myapp.datas.DataUtils.menu;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.myapp.model.Dish;;

public class StreamPractices2 {

	public static void main(String[] args) {
		if (menu.stream().anyMatch(Dish::isVegetarian)) {
			System.out.println("The menu is (somewhat) vegetarian friendly!!");
		}
		if (menu.stream().allMatch(d -> d.getCalories() < 1000)) {
			System.out.println("The menu is Healthy");
		}
		if (menu.stream().noneMatch(d -> d.getDishName().startsWith("K"))) {
			System.out.println("No one from korea");
		}

		Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();

		List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> firstSquareDivisibleByThree = someNumbers.stream().map(x -> x * x).filter(x -> x % 3 == 0)
				.findFirst(); // 9

		/**
		 * When to use findFirst and findAny: You may wonder why we have both findFirst
		 * and findAny. The answer is parallelism. Finding the first element is more
		 * constraining(restricting) in parallel. If you don’t care about which element is returned,
		 * use findAny because it’s less constraining when using parallel streams.
		 */

	}
}
