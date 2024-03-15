package abstraction;

public class Abstract_class2 extends Abstract_class1{

	@Override
	public void ex3() {
		System.out.println("good morning");
		
	}

	@Override
	public void ex4() {
		System.out.println("good night");	
		
	}
    public static void main(String[] args) {
    	Abstract_class2 a=new Abstract_class2();
    	
    	a.ex();
    	a.ex1();
    	a.ex3();
    	a.ex4();  	
	
    }
    }
