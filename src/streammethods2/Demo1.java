package streammethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(4, 2, 1, 3, 6, 8);
		List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); // ascending

		List<Integer> reversesortedList = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(reversesortedList);

		List<String> list2 = Arrays.asList("John", "Mary", "Kim", "David", "Smith");
		List<String> SortedString = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(SortedString);
		
		
	}

}
