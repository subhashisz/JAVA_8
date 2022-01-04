package com.myapp.stream_practices.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//Stream VS Collect
public class StreamPractices2 {

	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
		
		//using reduce() in replace of asList()
		// This uses mutable accumulator pattern which may be problemetic in parallism 
		List<Integer> numbers = stream.reduce(new ArrayList<Integer>(), (List<Integer> l, Integer e) -> {
			l.add(e);
			return l;
		}, (List<Integer> l1, List<Integer> l2) -> {
			l1.addAll(l2);
			return l1;
		});
	}

}
