package strems;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		Integer [] arr= {2,6,4,8,9,2,4,};
//		int [] sArray=Arrays.stream(arr).sorted().toArray();
//		System.out.println(Arrays. toString(sArray));
		

		Arrays.sort(arr,(Integer x,Integer y)->-x.compareTo(y));
		System.out.println(Arrays.toString(arr));
	}

}
