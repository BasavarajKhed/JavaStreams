package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		// distinct
		// limit
		// count

		List<String> vehiclesList = Arrays.asList("bus", "car", "bike", "Cycle", "bus", "Car", "bike");
		
		/*List<String> distinctvehiclesList = vehiclesList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctvehiclesList); //[bus, car, bike, Cycle, Car]
		vehiclesList.stream().distinct().forEach(v->System.out.println(v));
	*/
		//count
		/*
		 * long count=vehiclesList.stream().distinct().count();
		 * System.out.println(count);
		 */
		//count
		
		List <String> newlist=vehiclesList.stream().limit(3).collect(Collectors.toList());
		System.out.println(newlist); //[bus, car, bike]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
