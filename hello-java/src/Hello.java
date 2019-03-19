import java.util.List;
import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Himanshu","Sumit", "Jagmeet");
		
		names.forEach(System.out::println);

	}

}
