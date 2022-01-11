package by.epam.param.task02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyArrayList<T> implements MyList<T> {

	private Object[] mas = new Object[15];
	private int currentFreeIndex = 0;

	public Object getMas(int index) {
		return mas[index];
	}

	public int getCurrentFreeIndex() {
		return currentFreeIndex;
	}

	@Override
	public String toString() {
		return "MyArrayList [mas=" + Arrays.toString(mas) + ", currentFreeIndex=" + currentFreeIndex + "]";
	}

	@Override
	public void add(T obj) {
		if (currentFreeIndex >= mas.length) {
			Object[] masTemp = new Object[mas.length + 15];
			for (int i = 0; i <= mas.length; i++) {
				masTemp[i] = mas[i];
			}
			mas = masTemp;
		}

		if (mas[currentFreeIndex] == null) {
			mas[currentFreeIndex] = obj;
			currentFreeIndex++;
		} else {
			for (int i = currentFreeIndex + 1; i <= mas.length; i++) {
				if (mas[i] == null) {
					mas[i] = obj;
					currentFreeIndex = i + 1;
					i = mas.length + 1;
				}
			}
		}
	}

	@Override
	public void add(int index, T obj) {
		if (index >= mas.length) {
			Object[] masTemp = new Object[index + 2];
			for (int i = 0; i <= mas.length; i++) {
				masTemp[i] = mas[i];
			}
			mas = masTemp;
		}
		mas[index] = obj;

	}

	public int size() {
		return mas.length;
	}

	@Override
	public void sort() {

		Arrays.sort(mas, 0, currentFreeIndex);

		for (Object o : mas) {
			System.out.println(o);
		}

	}

	@Override
	public void remove(T obj) {
		for ( int i=0; i<mas.length; i++) {
			if(mas[i]==obj) {
				mas[i]=null;
			}
		}
		
	}

	@Override
	public void remove(int index, T obj) {
		if (mas[index]==obj) {
			mas[index]=null;
		}
		
	}

}
