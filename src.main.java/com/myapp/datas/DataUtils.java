package com.myapp.datas;

import java.awt.Window.Type;
import java.util.Arrays;
import java.util.List;

import com.myapp.model.Dish;

public class DataUtils {

	public static List<Dish> menu = Arrays.asList(new Dish("Fish", 500, Boolean.FALSE),
			new Dish("Egg", 600, Boolean.FALSE), new Dish("Chicken", 500, Boolean.FALSE),
			new Dish("Prawn", 800, Boolean.FALSE), new Dish("Paneer", 900, Boolean.TRUE),
			new Dish("Tofu", 120, Boolean.TRUE), new Dish("Rice", 400, Boolean.TRUE),
			new Dish("Brokley", 300, Boolean.TRUE), new Dish("Lamb", 200, Boolean.FALSE),
			new Dish("Cheese", 200, Boolean.TRUE), new Dish("Salad", 350, Boolean.TRUE),
			new Dish("Burger", 250, Boolean.FALSE));
}
