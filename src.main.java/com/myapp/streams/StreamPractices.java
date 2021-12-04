package com.myapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractices {
	public static void main(String[] args) {
		String[] languages = { "Java", "Python", "JavaScript" };
		Stream<String> numbers = Stream.of(languages);
		numbers.forEach(System.out::println);

		ArrayList<String> aList = (ArrayList<String>) numbers.distinct().collect(Collectors.toList());
		List<String> aList1 = numbers.collect(Collectors.toList());
		ArrayList<String> aList2 = (ArrayList<String>) numbers.collect(Collectors.toList());
		ArrayList<String> arrayList = numbers.collect(Collectors.toCollection(ArrayList::new));

	}

}
