package com.myapp.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.myapp.model.Employee;

import static com.myapp.utils.DataStaticFactory.getAllEmployees;

public class StreamPracticesTwo {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("chiku");
		fruits.add("dragon fruit");

		List<String> sortedFruitAsc1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		List<String> sortedFruitAsc2 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		List<String> sortedFruitAsc3 = fruits.stream().sorted().collect(Collectors.toList());

		List<String> sortedFruitDesc = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		List<Employee> sortedEmplyeeByNameAsc = getAllEmployees().stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());
		List<Employee> sortedEmplyeeBySalaryAsc = getAllEmployees().stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());
		List<Employee> sortedEmplyeeBySalaryDesc = getAllEmployees().stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());

	}

}
