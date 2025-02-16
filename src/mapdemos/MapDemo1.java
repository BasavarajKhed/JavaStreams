package mapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Test", "Khed", "Basavaraj", "Testing");
		List<String> namesUpperCase = new ArrayList();
//Before Java 8
		/*
		 * for (String nam : names) { namesUpperCase.add(nam.toUpperCase()); }
		 * System.out.println(namesUpperCase);
		 * 
		 */
		/*namesUpperCase = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesUpperCase);*/
//		names.stream().map(n -> n.toUpperCase()).forEach(null)
		
	}

}
