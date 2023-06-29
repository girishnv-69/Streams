package strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNmaes {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Girish","Mayank","Praveen","Yshwanth","Sakshi","Bharath");
	List<String> res=names.stream()
					   	  .sorted((s1,s2)->s2.compareTo(s1))
						  .collect(Collectors.toList());
	System.out.println(res);
	}
}
