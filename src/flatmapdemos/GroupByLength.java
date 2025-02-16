package flatmapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		List<String> planets = Arrays.asList("Mars", "Rock", "Pluto", "Tesla");
		Map<Integer, List<String>> groupByLength = planets.stream().collect(Collectors.groupingBy(String::length));

		groupByLength.values().stream()
		.filter(n -> n.size() > 1).forEach(n -> {
			String length = String.valueOf(n.get(0).length());
			System.out.println("[" + String.join(" ,", n) + "," + length + "]");

		});

	}

}
