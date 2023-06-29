package strems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(3,5,9,6,4,7,8,3,5);
		List<Integer> res=values.stream().filter(x->x%2==0).map(x->x+x).collect(Collectors.toList());

		System.out.println(res);
	}
}
