package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		List<Integer> numlist = Arrays.asList(2, 3, 4, 5, 6);
		List<Integer> multipliedList = new ArrayList();
		/*
		 * for (int n : numlist) { // System.out.println(n * 3); multipliedList.add(n *
		 * 3); } System.out.println(multipliedList);
		 */

		/*
		 * multipliedList= numlist.stream().map(n->n*3).collect(Collectors.toList());
		 * System.out.println(multipliedList);
		 */
		/*
		 * numlist.stream().map(n -> n * 3).
		 * 
		 * forEach(num->System.out.println(num));
		 */
		
		numlist.stream().map(n -> n * 3).

		forEach(System.out::println);
	}

}
