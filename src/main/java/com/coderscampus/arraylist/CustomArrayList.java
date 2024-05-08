package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	private int objectArraySize = 10;
	private int currentListSize;
	Object[] items = new Object[objectArraySize];

	@Override
	public boolean add(T item) {

		if (currentListSize < objectArraySize) {
			items[currentListSize] = item;
			currentListSize++;
			return true;
		} else if (currentListSize >= objectArraySize) {

			objectArraySize = objectArraySize * 2;

			Object[] increasedItems = new Object[objectArraySize];

			for (int i = 0; i < currentListSize; i++) {
				increasedItems[i] = items[i];
			}

			items = new Object[objectArraySize];

			for (int i = 0; i < currentListSize; i++) {
				items[i] = increasedItems[i];
			}

			items[currentListSize] = item;

			currentListSize++;
			return true;
		} else
			return false;
	}

	@Override
	public int getSize() {

		return currentListSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) items[index];
	}

}
