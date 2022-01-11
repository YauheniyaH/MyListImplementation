package by.epam.param.task02;

public class Main {

	public static void main(String[] args) {

		MyList<Integer> list = new MyArrayList<Integer>();

		list.add(5);
		list.add(65);
		list.add(-25);

		System.out.println(list.toString());
		
		list.add(3, 11);
		list.add(7);

		System.out.println(list.toString());
		
		list.remove(5);
		
		System.out.println(list.toString());
		
		list.remove(1,65);
		
		System.out.println(list.toString());
		list.remove(1,null);
		System.out.println(list.toString());

	}

}
