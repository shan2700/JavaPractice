package polymorp;

	public class Override extends Overrid{
		int i = 300;
		
		
		public void Ex() {
			
			System.out.println("his money"+ super.i);	
			
		}
		
		public static void main(String[] args) {
	
			Override a = new Override();
			
			a.Ex();
				
		}
		
	}
	