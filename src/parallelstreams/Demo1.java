package parallelstreams;

import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int score;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}

public class Demo1 {

	public static void main(String[] args) {
		
    List<Student> listOfStudent =Arrays.asList(
		new Student("Basav",100),
		new Student("Akash",80),
		new Student("Ganesh",75),
		new Student("Anil",60),
		new Student("Rag",97),
		new Student("Kedar",85),
		new Student("Abhi",102)
		
		);
    //Sequential Stream
    listOfStudent.stream().filter(s->s.getScore()>80)
    .limit(3)
    .forEach(s->System.out.println(s.getName() +" "+s.getScore()));
    
    //Parallel Stream
    
    listOfStudent.parallelStream().filter(s->s.getScore()>80)
    .limit(3)
    .forEach(s->System.out.println(s.getName() +" "+s.getScore()));
    
    //convert stream()-->parallelstream()
    //parallel
    listOfStudent.stream().parallel().filter(s->s.getScore()>80)
    .limit(3)
    .forEach(s->System.out.println(s.getName() +" "+s.getScore()));
  
    
	}

}
