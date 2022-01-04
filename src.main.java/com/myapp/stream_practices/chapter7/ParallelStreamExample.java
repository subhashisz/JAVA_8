package com.myapp.stream_practices.chapter7;

import java.util.stream.Stream;

public class ParallelStreamExample {

	public static Long sequentialSum(Long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
	}

	public static Long parallelSum(Long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
	}

	public static long fact(int n) {
		return n == 1 ? 1 : n * fact(n - 1);
	}

}
