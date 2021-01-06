package com.coderscampus.olaf.assignment05;

import java.util.Random;

public class CustomArrayListApplication {

	public static void main(String[] args) {

		final Integer LIST_SIZE = 11;
		final Integer GET_ELEMENT_AT_INDEX = 5;

		listOfIntegers(LIST_SIZE, GET_ELEMENT_AT_INDEX);
		listOfStrings(LIST_SIZE, GET_ELEMENT_AT_INDEX);

	}

	private static void listOfIntegers(final Integer LIST_SIZE, final Integer GET_ELEMENT_AT_INDEX) {

		Random random = new Random();
		System.out.println("---------\nIntegers: \n---------");
		CustomList<Integer> integers = new CustomArrayList<>();

		for (int i = 0; i < LIST_SIZE; i++)
			integers.add(random.nextInt(100));

		for (int i = 0; i < integers.getSize(); i++)
			System.out.println("index " + i + ": " + integers.get(i));

		System.out.println("----");

		System.out.println("CustomList element count: " + integers.getSize());
		System.out
				.println("Element at index " + GET_ELEMENT_AT_INDEX + ": " + integers.get(GET_ELEMENT_AT_INDEX) + "\n");
	}

	private static void listOfStrings(final Integer LIST_SIZE, final Integer GET_ELEMENT_AT_INDEX) {
		Random random = new Random();

		System.out.println("---------\nStrings: \n---------");
		CustomList<String> strings = new CustomArrayList<>();

		for (int i = 0; i < LIST_SIZE; i++)
			strings.add("Element " + random.nextInt(100));

		for (int i = 0; i < strings.getSize(); i++)
			System.out.println("index " + i + ": " + strings.get(i));

		System.out.println("----");

		System.out.println("CustomList element count: " + strings.getSize());
		System.out.println("Element at index " + GET_ELEMENT_AT_INDEX + ": " + strings.get(GET_ELEMENT_AT_INDEX));

	}

}
