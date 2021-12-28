package com.myapp.utility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArray {

	// Stream.of() method
	// Method to concatenate two arrays in Java 8 and above
	public static String[] concatenate(String[] first, String[] second) {
		return Stream.of(first, second).flatMap(Stream::of) // or, use `Arrays::stream`
				.toArray(String[]::new);
	}

	// Stream.concat() method
	// Method to concatenate two arrays in Java 8 and above
	public static String[] concatenate1(String[] first, String[] second) {
		return Stream.concat(Arrays.stream(first), Arrays.stream(second)).toArray(String[]::new);
	}

	// Using System.arraycopy() method
	// Method to concatenate two arrays in Java
	public static String[] concatenate2(String[] first, String[] second) {
		String[] arr = new String[first.length + second.length];
		System.arraycopy(first, 0, arr, 0, first.length);
		System.arraycopy(second, 0, arr, first.length, second.length);

		return arr;
	}

	// Generic method to concatenate arrays of the same type in Java
	public static <T> T[] concatenate3(T[] first, T[] second) {
		T[] ob = (T[]) Array.newInstance(first.getClass().getComponentType(), first.length + second.length);
		System.arraycopy(first, 0, ob, 0, first.length);
		System.arraycopy(second, 0, ob, first.length, second.length);

		return ob;
	}

	// Generic method to concatenate arrays of the same type in Java
	public static <T> T[] concatenate4(T[] first, T[] second) {
		T[] result = Arrays.copyOf(first, first.length + second.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		return result;
	}

	// Using List

	// Method to concatenate two arrays in Java 8 and above
	public static String[] concatenate5(String[] first, String[] second) {
		List<String> result = new ArrayList<>();
		Stream.of(first, second).flatMap(Stream::of).map(x -> (String) x).forEach(result::add);
		return result.toArray(new String[0]);
	}

	// Method to concatenate two arrays in Java
	public static String[] concatenate6(String[] first, String[] second) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, first);
		Collections.addAll(list, second);
		return list.toArray(new String[0]);
	}

	// Method to concatenate two arrays in Java
	public static String[] concatenate7(String[] first, String[] second) {
		List<String> list = new ArrayList<>(Arrays.asList(first));
		Collections.addAll(list, second);
		return list.toArray(new String[0]);
	}

}
