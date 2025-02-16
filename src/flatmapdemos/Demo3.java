package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {

	String name;
	int rollnum;
	char grade;

	public Student(String name, int rollnum, char grade) {

		this.name = name;
		this.rollnum = rollnum;
		this.grade = grade;
	}

}

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("Smith", 101, 'A'));
		studentList1.add(new Student("John", 102, 'B'));
		studentList1.add(new Student("Kennedy", 103, 'C'));
		studentList1.add(new Student("Ben", 104, 'S'));

		ArrayList<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(new Student("Cena", 105, 'A'));
		studentList2.add(new Student("Vik", 106, 'B'));
		studentList2.add(new Student("KT", 107, 'C'));
		studentList2.add(new Student("Rev", 108, 'S'));

		List<ArrayList<Student>> StuList = Arrays.asList(studentList1, studentList2);

		/*
		 * for (List<Student> s : StuList) { for (Student stu : s) {
		 * System.out.println(stu.name); } }
		 */
		

		 List <String> namestu=	StuList.stream()
		.flatMap(stulist->stulist.stream())
		.map(s->s.name)
		.collect(Collectors.toList());
		
		 System.out.println(namestu);
		
		
		
		
		
		

	}

}
