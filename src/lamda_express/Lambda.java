package lamda_express;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
	List<Object> i = new ArrayList<>();
	
		i.add("shan");
		
		i.add(89);
		
		i.add("wiper");
		
		i.forEach((a)->System.out.println(a));
	
	
	}
	
}


