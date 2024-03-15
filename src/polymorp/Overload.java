
package polymorp;

public class Overload {

	public static void main(String[] args) {
		
		
	 Overload shan = new Overload();

	   shan.exp("cute",1234,"shan@12");
	   
	  Overload shan1 = new Overload();

	  shan1.exp("hot",111,123,"vetri@12");
	 
	}
	public void exp(String String, int i, String String2) {
		
		System.out.println(String);
		System.out.println(i);
		
	}
	public void exp(String string, int i, int j, String string2) {
		
		System.out.println(string);
		System.out.println(j);			
	}
	
}
