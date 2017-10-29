package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(

				new Person("Charles", "dickens", 60),

				new Person("lewis", "carrol", 42),

				new Person("Thomas", "carlyle", 51),

				new Person("Matthew", "Arnold", 39));

		// sort list by lastname

		System.out.println("printing with last name");

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastname().compareTo(o2.getLastname());
			}
		});

		// create a method that print all elements in a list with c
		System.out.println("printing with last name c");
		printall(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastname().startsWith("c");
			}

		});

		printallpeople(people);

	}

	private static void printallpeople(List<Person> people) {

		for (Person p : people) {

			System.out.println("all the name are: " + p);
		}

	}

	private static void printall(List<Person> people, Condition condition) {

		for (Person p : people) { // writing an interface with a condition below

			if (condition.test(p)) {

				System.out.println("person with last name" + p);
			}

		}

	}

	// private static void printall(List<Person> people) {
	// here i am writing a condition and writing an interface
	// for (Person p : people) {
	//
	// if (p.getLastname().startsWith("c")) {
	//
	// System.out.println("person with last name"+p);
	// }
	//
	// }
	//
	// }

	interface Condition {

		boolean test(Person p);

	}

}
