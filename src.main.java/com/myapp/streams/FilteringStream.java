package com.myapp.streams;

import static com.myapp.utils.DataStaticFactory.getAllProducts;

import java.util.List;
import java.util.stream.Collectors;

import com.myapp.model.Product;

public class FilteringStream {
	public static void main(String[] args) {
		List<Product> productList = getAllProducts().stream().filter(p -> p.getPrice() > 29000f).collect(Collectors.toList());

	}

}
