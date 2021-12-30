package com.myapp.questions_answars;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class QuestionsAndAnswarsSet1 {

	public static void main(String[] args) {
		/**
		 * Given : String array ["Hello", "World"] OUTPUT: ["H", "e", "l", "o","W", "r",
		 * "d"].
		 */
		List<String> words = Arrays.asList("Hello", "World");
		// List<String>
		// uniqueWords=words.stream().map(w->w.split("")).flatMap(Stream::of).

		/**
		 * Given a list of numbers, how would you return a list of the square of each
		 * number? For example, given [1, 2, 3, 4, 5] you should return [1, 4, 9, 16,
		 * 25].
		 */

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> numberListResult = numberList.stream().map(i -> i * i).collect(toList());

		/**
		 * Given two lists of numbers, how would you return all pairs of numbers? For
		 * example, given a list [1, 2, 3] and a list [3, 4] you should return [(1, 3),
		 * (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. For simplicity, you can represent a
		 * pair as an array with two elements.
		 */
		List<Integer> pairList1 = Arrays.asList(1, 2, 3);
		List<Integer> pairList2 = Arrays.asList(3, 4);

		List<int[]> pairListResult = pairList1.stream().flatMap(i -> pairList2.stream().map(j -> new int[] { i, j }))
				.collect(toList());

		/**
		 * How would you extend the previous example to return only pairs whose sum is
		 * divisible by 3? For example, (2, 4) and (3, 3) are valid.
		 */
		List<int[]> divisibleByThree = pairList1.stream()
				.flatMap(i -> pairList2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
				.collect(toList());

	}

}
