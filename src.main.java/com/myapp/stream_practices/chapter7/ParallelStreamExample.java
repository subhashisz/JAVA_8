package com.myapp.stream_practices.chapter7;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static Long sequentialSum(Long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
	}

	public static Long parallelSum(Long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
	}

	static int factorialIterative(int n) {
		int r = 1;
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	public static long fact(int n) {
		return n == 1 ? 1 : n * fact(n - 1);
	}

	static long factorialStreams(long n) {
		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
	}

	// Tail-recursive factorial
	static long factorialTailRecursive(long n) {
		return factorialHelper(1, n);
	}

	static long factorialHelper(long acc, long n) {
		return n == 1 ? acc : factorialHelper(acc * n, n - 1);
	}
	// Tail-recursive factorial
}
