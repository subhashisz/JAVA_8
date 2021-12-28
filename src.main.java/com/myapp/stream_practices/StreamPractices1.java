package com.myapp.stream_practices;

import static com.myapp.datas.DataUtils.menu;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

import java.util.Arrays;
import java.util.List;

import com.myapp.model.Dish;

public class StreamPractices1 {

	public static void main(String[] args) {

		// Collect all the vegetarian dishes
		List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian).collect(toList());

		List<Integer> aList = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

		// Remove duplicate element from list
		aList.stream().distinct().collect(toList());

		// Filtering even numbers
		// aList.stream().filter(i -> i % 2 == 0).distinct().forEach(i ->
		// System.out.print(" " + i + " "));

		// Filtering odd numbers
		// aList.stream().filter(i -> i % 2 == 1).distinct().forEach(i ->
		// System.out.print(" " + i + " "));

		// get first three dishes whose calories is greater then 300
		List<Dish> dishes = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());

		// get last three dishes whose calories is greater then 300
		menu.stream().filter(d -> d.getCalories() > 300).skip(2).collect(toList());

		// filter the first two meat dishes
		menu.stream().filter(d -> !d.isVegetarian()).limit(2).collect(toList());

		// filter the maximum calories of all dishes

		// Display all the dish names
		menu.stream().map(Dish::getDishName).collect(toList());

		List<String> words = Arrays.asList("Java8", "Lambdas", "In", "Action");
		words.stream().map(String::length).collect(toList());

		// Display length of all the dish names
		menu.stream().map(Dish::getDishName).map(String::length).collect(toList());

		List<String> words1 = Arrays.asList("Hello", "World");
		// OUTPUT: ["H", "e", "l", "o","W", "r", "d"].
		words1.stream().map(w -> w.split("")).distinct().collect(toList());

		// From the menu find the sum of all calories of all dishes
		// menu.stream().filter(Dish::getCalories).collect(Collectors.averagingInt(get))
	}

}
