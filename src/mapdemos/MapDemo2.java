package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Test", "Khed", "Basavaraj", "Testing");
		List<Integer> LengthOfEachWordinArrayList = new ArrayList();

//Before Java 8
		/*
		 * for (String nam : names) {
		 * 
		 * LengthOfEachWordinArrayList.add(nam.length()); }
		 * System.out.println(LengthOfEachWordinArrayList);
		 */

//		names.stream().map(n -> n.length()).forEach(name -> System.out.println(name));
		names.stream().map(n -> n.length()).forEach(System.out::println);
	}

}
