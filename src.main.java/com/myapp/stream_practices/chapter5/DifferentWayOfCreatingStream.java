package com.myapp.stream_practices.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentWayOfCreatingStream {

	public static void main(String[] args) {
		// Streams from values
		Stream<String> stream = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
		// Empty Stream
		Stream<String> emptyStream = Stream.empty();
		// Stream from array
		int[] arr = { 1, 2, 3, 4 };
		int intStream = Arrays.stream(arr).sum();

		// Stream from file

		long unoqueWords = 0;
		long words = 0;
		/*
		 * try (Stream<String> lines = Files.lines(Paths.get("data.txt"),
		 * Charset.defaultCharset())) { unoqueWords = lines.flatMap(line ->
		 * Arrays.stream(line.split(" "))).distinct().count(); words =
		 * lines.flatMap(line -> Arrays.stream(line.split(" "))).count(); } catch
		 * (IOException ex) { ex.printStackTrace(); }
		 */

		// Stream from collection
		List<Integer> aList = Arrays.asList(1, 2, 3, 4);

		// The Streams API provides two static methods to generate a stream from a
		// function:
		// Stream.iterate and Stream.generate
		// Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

		// Fibonacci Series
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20)
				.forEach(t -> System.out.print("(" + t[0] + "," + t[1] + ")"));
		System.out.println();
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20)
				.forEach(t -> System.out.print(t[0] + " "));
		System.out.println();
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(20).map(t -> t[0])
				.forEach(System.out::print);
		System.out.println();
		Stream.generate(Math::random).limit(5).forEach(System.out::print);
		
		// Fibonacci Series
		IntSupplier fib = new IntSupplier(){
			private int previous = 0;
			private int current = 1;
			public int getAsInt(){
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
