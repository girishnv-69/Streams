package strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
	List<Integer> values=Arrays.asList(26,29,31,46,76,19,24,49);
	List<Integer> eList =values.stream()
			.filter(x->x%2==0).collect(Collectors.toList());
	System.out.println(eList);
	}
}
