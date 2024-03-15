package looping;

import java.util.ArrayList;
import java.util.List;

public class For_each {

	public static void main(String[] args) {
		
     	List<Object> i = new ArrayList<>();
		
		i.add("shan");
		i.add(89);
		i.add("wiper");
	
		for (Object m : i) {
		
		System.out.println(m);
		
	}
		
	}
}