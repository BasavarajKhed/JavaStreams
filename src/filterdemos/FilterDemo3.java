package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("cup", null, "John", "Daenerys", "Joffery",null,"Basavraj");
		List<String> withoutNullList = new ArrayList<String>();
		/*withoutNullList= names.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(withoutNullList);
		*/
		
		names.stream().filter(str->str!=null).forEach(st->System.out.println(st));
	}

}
