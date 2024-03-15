package keyword;

public class Sup1 extends Sup{
	
	
	int i = 300;
	
	public void e() {
		
		System.out.println("my money"+ super.i);
		
	}
	
	public static void main(String[] args) {
		
		Sup1 a = new Sup1();
		
		a.e();
		
	}
	
	
	


}
