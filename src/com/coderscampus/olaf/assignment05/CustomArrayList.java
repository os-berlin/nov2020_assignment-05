package com.coderscampus.olaf.assignment05;

public class CustomArrayList<T> implements CustomList<T> {
	static final Integer ARRAY_SIZE = 10;
	Object[] items = new Object[ARRAY_SIZE];

	private Integer ArrayIndex = 0;

	@Override
	public boolean add(T item) {
		if (ArrayIndex < items.length) {
			items[ArrayIndex++] = item;
			return true;
		} else {
			Object[] expandedArray = new Object[(items.length) * 2];
			for (int i = 0; i < items.length; i++) {
				expandedArray[i] = items[i];
			}
			items = expandedArray;

			items[ArrayIndex++] = item;
			return true;
		}
	}

	@Override
	public int getSize() {

//		Integer itemCount = 0;
//
//		while (itemCount < items.length && items[itemCount] != null)
//			itemCount++;
//		return itemCount;

		return ArrayIndex;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {

		if (index >= 0 && index < items.length) {
			return (T) items[index];
		} else
			return null;
	}

}