import java.util.List;
import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Himanshu S.","Sumit K.", "Jagmeet S.", "Srikanth E");
		
		System.out.println("============== Employee names ========================");
		names.forEach(System.out::println);
		System.out.println("============== Employee names Ends ========================");
		

	}

}
