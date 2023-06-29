package strems;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElements {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(3,5,9,6,4,7,8,3,5);
		int sum=values.stream()
				.reduce(0, (ans,i)->ans+i);
		System.out.println(sum);
	}

}
