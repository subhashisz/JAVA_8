package com.myapp.model;

public class Dish {
	enum Type {
		FISH, OTHER, MEAT
	}

	private final String dishName;
	private final int calories;
	private final boolean vegetarian;

	public Dish(String dishName, int calories, boolean vegetarian) {
		super();
		this.dishName = dishName;
		this.calories = calories;
		this.vegetarian = vegetarian;
	}

	public String getDishName() {
		return dishName;
	}

	public int getCalories() {
		return calories;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((dishName == null) ? 0 : dishName.hashCode());
		result = prime * result + (vegetarian ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (calories != other.calories)
			return false;
		if (dishName == null) {
			if (other.dishName != null)
				return false;
		} else if (!dishName.equals(other.dishName))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + ", calories=" + calories + ", vegetarian=" + vegetarian + "]";
	}
}
