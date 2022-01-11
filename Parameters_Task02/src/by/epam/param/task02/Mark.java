package by.epam.param.task02;

import java.util.Objects;

public class Mark <T extends Number> implements Comparable<Mark<T>>{
	private T mark;

	public T getMark() {
		return mark;
	}

	public void setMark(T mark) {
		this.mark = mark;
	}

	public Mark(T mark) {
		super();
		this.mark = mark;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mark<T> other = (Mark<T>) obj;
		return Objects.equals(mark, other.mark);
	}

	@Override
	public String toString() {
		return "Mark [mark=" + mark + "]";
	}

	@Override
	public int compareTo(Mark<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
