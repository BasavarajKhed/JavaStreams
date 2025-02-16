package mapdemos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
}

public class MapDemo4 {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee(101, "Alex", 10000), new Employee(102, "Brian", 20000),
				new Employee(103, "Charles", 30000), new Employee(104, "David", 40000),
				new Employee(105, "Brian", 50000));

		List<Double>empsal= employeeList.stream()
				.filter(s -> s.sal > 20000)
				.map(e -> e.sal)
				.collect(Collectors.toList());
		
		System.out.println(empsal);

	}

}
