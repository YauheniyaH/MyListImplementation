package by.epam.param.task02;

import java.util.Comparator;
import java.util.List;

public interface MyList<T > {
	void add(T obj);

	void add(int index, T obj);

	void remove(T obj);

	void remove(int index, T obj);

	void sort();
	
	int size();

	//T getMas(int i);

	//List<T> sort(Comparator<T> comparator);

//List<T> sort(Comparator<? super T> comparator);

}
