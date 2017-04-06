package work.laptop.hp;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("hello");
		str.add("bye");
		int k = str.size();
		Object[] arr = str.toArray();
		System.out.println(k +"\n" + arr.length);
	}

}
