package strems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int [] arr= {2,6,4,8,9,2,4,};
		HashSet<Integer> hs= new HashSet<>();
		Arrays.stream(arr).filter(x->!hs.add(x)).forEach(System.out::println);
	}
}
