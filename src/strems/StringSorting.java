package strems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSorting {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Girish","Mayank","Praveen","Yshwanth","Sakshi","Bharath");
	    Set<String> res=names.stream().filter(name->name.toLowerCase().contains("s"))
	    			.collect(Collectors.toSet());
	    System.out.println(res);
	}

}
