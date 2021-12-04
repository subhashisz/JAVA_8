package com.myapp.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamOperations {
	public static void main(String[] args) {

		//Collection to stream
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> collectionStream = collection.stream();
		System.out.println("---------------------");
		collectionStream.forEach(System.out::println);

		//List to stream
		List<String> aList = Arrays.asList("x", "y", "z");
		Stream<String> listStream = aList.stream();
		System.out.println("---------------------");
		aList.forEach(System.out::println);

		//Set to stream
		Set<String> aSet = new HashSet<>();
		Stream<String> setStream = aSet.stream();
		System.out.println("---------------------");
		setStream.forEach(System.out::println);

		//String Array to stream
		String[] strArr = { "i", "j", "k" };
		Stream<String> arrStream = Arrays.stream(strArr);
		System.out.println("---------------------");
		arrStream.forEach(System.out::println);
		
		//int array to stream
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Stream<Integer> intArrStream = Arrays.stream(data).boxed();
		
		
		
		
		
		
		

	}
}
