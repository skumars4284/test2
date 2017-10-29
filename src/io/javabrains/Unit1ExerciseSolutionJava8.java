package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import io.javabrains.Unit1ExerciseSolutionJava7.Condition;

public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(

				new Person("Charles", "dickens", 60),

				new Person("lewis", "carrol", 42),

				new Person("Thomas", "carlyle", 51),

				new Person("Matthew", "Arnold", 39));

		// step 1: sort list by lastname

		System.out.println("printing with last name ");

		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

		// step 2: create a method that print all elements in a list with c
		
		System.out.println("printing with last name starting with c");
		
		printall(people, p -> p.getLastname().startsWith("c"));

		// step 3: print all the names
		//printallpeople(people);// re writing this after blockin the interface

		printall(people, p -> true);
		
		
	}

	private static void printallpeople(List<Person> people) {

		for (Person p : people) {

			System.out.println("all the name are: " + p);
		}

	}

//	private static void printall(List<Person> people, Condition condition) { rewriting with java outof box interfaces
//
//		for (Person p : people) { // writing an interface with a condition below
//
//			if (condition.test(p)) {
//
//				System.out.println("person with last name" + p);
//			}

	
	private static void printall(List<Person> people, Predicate<Person> predicate) {

		for (Person p : people) { // writing an interface with a condition below

			if (predicate.test(p)) {

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

//	interface Condition { we are taking this since we dont want interfaces here because they are in the condition 
//
//		boolean test(Person p);
//
//	}

}
