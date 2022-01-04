package com.myapp.stream_practices.chapter10;

import java.util.Optional;

import com.myapp.model.Address;
import com.myapp.model.Dish;
import com.myapp.model.Employee;

public class OptionalExample {

	public static void main(String[] args) {

		// Empty optional
		Optional<Dish> optDish = Optional.empty();

		// Optional from null
		Optional<Dish> optDish1 = Optional.ofNullable(new Dish("fish", 500, Boolean.FALSE));

		// Optional from value
		Optional<Dish> optDish2 = Optional.of(new Dish("fish", 500, Boolean.FALSE));

		// Extracting and transforming values from optionals with map

		String name = null;
		Dish dish = new Dish("fish", 500, Boolean.FALSE);
		if (dish.getDishName() != null) {
			name = dish.getDishName();
		}

		Optional<Dish> optInsurance = Optional.ofNullable(new Dish("fish", 500, Boolean.FALSE));
		Optional<String> name1 = optInsurance.map(Dish::getDishName);
		// It’s conceptually similar to the stream’s map method

	}


	public String getPersonName(Optional<Employee> employee, int id) {
		return employee.filter(e -> e.getId() == id)
				.flatMap(Employee::getAddress)
				.map(Address::getCity)
				.orElse("something");
	}

}
