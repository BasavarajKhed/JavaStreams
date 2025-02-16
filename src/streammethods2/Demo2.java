package streammethods2;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {

		Set<String> fruits = new HashSet<String>();

		fruits.add("One Apple");
		fruits.add("One Mango");
		fruits.add("Two Apple");
		fruits.add("More Grapes");
		fruits.add("Two Guavas");
		// anyMatch
		boolean result = fruits.stream().anyMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);

        //AllMatch
	 result = fruits.stream().allMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);
		
		
		 //AllMatch
		 result = fruits.stream().noneMatch(value -> {
			return value.startsWith("One");
		});
		System.out.println(result);
		
	}

	
	
}
