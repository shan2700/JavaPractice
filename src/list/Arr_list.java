package list;

import java.util.ArrayList;

import java.util.List;

public class Arr_list {

	public static void main(String[] args) {
		
	List<Object> i = new ArrayList<>(); 
		
		 i.add("shan");
		
		 i.add(89);
		
		 i.add("wiper");
		 
		 int a = i.size();
		 
	 System.out.println(a);	
	     
		 i.removeAll(i);
		
	 System.out.println(i);
        
	}
  }