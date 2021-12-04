package com.myapp.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AppUtils {

	public void meth() {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// To boxed array
		Integer[] what = Arrays.stream(data).boxed().toArray(Integer[]::new);
		Integer[] ever = IntStream.of(data).boxed().toArray(Integer[]::new);

		// To boxed list
		List<Integer> you = Arrays.stream(data).boxed().collect(Collectors.toList());
		List<Integer> like = IntStream.of(data).boxed().collect(Collectors.toList());
	}

	public static Integer[] convertIntToIntegerArray(int[] arg) {
		/*
		 * Integer[] newArray = new Integer[arg.length]; for (int i = 0; i < arg.length;
		 * i++) { newArray[i] = Integer.valueOf(arg[i]); }
		 */
		return Arrays.stream(arg).boxed().toArray(Integer[]::new);
	}
	
	public static Integer[][] convertIntToIntegerArray(int[][] arg) {
		Integer[][] newArray = new Integer[arg.length][arg.length];
		for (int i = 0; i < arg.length; i++) {
			//newArray[i] = Integer.valueOf(arg[i]);
		}
		return null;
	}

	public static int[] convertIntegerToIntArray(Integer[] arg) {
		int[] newArray = new int[arg.length];
		for (int i = 0; i < arg.length; i++) {
			newArray[i] = arg[i].intValue();
		}
		return newArray;
	}
}
