package com.myapp.stream_practices.chapter6;

import static com.myapp.datas.DataUtils.menu;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;

import com.myapp.model.Dish;

public class StreamPractices1 {

	public static void main(String[] args) {

		// Collectors count
		long howManyDishes1 = menu.stream().collect(counting());// here returns Long

		// Stream count
		long howManyDishes2 = menu.stream().count();// returns long always

		// What are the differences between above two statements

		Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
		Optional<Dish> mostCalorieDish = menu.stream().collect(maxBy(dishCaloriesComparator));

		//calculate total calories
		int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));

		//calculate average of total calories
		double avgCalories = menu.stream().collect(averagingInt(Dish::getCalories));

		//calculate min max average  ... of total calories
		IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));

		//Get all the dish names
		String shortMenu = menu.stream().map(Dish::getDishName).collect(joining());
		//Get all the dish names but if toString() was overrided in Dish
		// String shortMenu1 = menu.stream().collect(joining());
		
		//Get all the dish names separated with comma overloaded version of joining
		String shortMenu2 = menu.stream().map(Dish::getDishName).collect(joining(", "));
		
		//calculate total calories this is more generalized form
		int totalCalories2 = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
		
		

	}

}
