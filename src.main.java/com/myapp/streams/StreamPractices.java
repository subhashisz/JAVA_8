package com.myapp.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractices {
	public static void main(String[] args) {
		String[] languages = { "Java", "Python", "JavaScript" };
		Stream numbers = Stream.of(languages);
		numbers.forEach(System.out::println);
		ArrayList<String> aList= (ArrayList<String>)numbers.distinct().collect(Collectors.toList());
		

	}

}
