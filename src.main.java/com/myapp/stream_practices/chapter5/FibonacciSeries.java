package com.myapp.stream_practices.chapter5;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FibonacciSeries {
	public static void main(String[] args) {
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20)
				.forEach(t -> System.out.print("(" + t[0] + "," + t[1] + ")"));
		System.out.println();
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20)
				.forEach(t -> System.out.print(t[0] + " "));
		System.out.println();
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20).map(t -> t[0])
				.forEach(System.out::print);

		// Fibonacci Series
		IntSupplier fib = new IntSupplier() {
			private int previous = 0;
			private int current = 1;

			public int getAsInt() {
				int oldPrevious = this.previous;
				int nextValue = this.previous + this.current;
				this.previous = this.current;
				this.current = nextValue;
				return oldPrevious;
			}
		};
		IntStream.generate(fib).limit(10).forEach(System.out::println);
	}

}
