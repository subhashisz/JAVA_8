package com.myapp.stream_practices.chapter6;

import static com.myapp.datas.DataUtils.menu;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import com.myapp.model.Dish;

public class GroupingPartioning {
	public static void main(String[] args) {

		// Map<Boolean, List<Dish>>
		// partionMap=menu.stream().collect(partitioningBy(Dish::isVegetarian),groupingBy(Dish::getDishName))
		Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream().collect(partitioningBy(Dish::isVegetarian,
				collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));

	}

	public Map<Boolean, List<Integer>> partitionPrimes(int n) {
		return IntStream.rangeClosed(2, n).boxed().collect(partitioningBy(candidate -> isPrime(candidate)));
	}

	public boolean isPrime(int candidate) {
		int candidateRoot = (int) Math.sqrt((double) candidate);
		return IntStream.rangeClosed(2, candidateRoot).noneMatch(i -> candidate % i == 0);
	}
}
