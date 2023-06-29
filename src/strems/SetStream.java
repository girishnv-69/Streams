package strems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStream {
	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(3,5,9,6,4,7,8,3,5);
		 Set<Integer> res =values.stream()
								 .map(x->x*x)
								 .collect(Collectors.toSet());// toSset() will remove the duplicates 
 		 System.out.println(res);
	}
}
