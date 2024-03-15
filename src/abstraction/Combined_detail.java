package abstraction;

public class Combined_detail implements Shanthosh_details,Education {

	@Override
	public void college() {
		System.out.println("bharath university");
		
	}

	@Override
	public void course() {

		System.out.println("b.tech cse");
		
	}

	@Override
	public void batch() {
		System.out.println("2019-2023");
	
	}

	@Override
	public void percentage() {
		System.out.println("88");
		
	}

	@Override
	public void name() {
		System.out.println("shanthosh");
		
	}

	@Override
	public void age() {
		System.out.println("22");
		
	}

	@Override
	public void city() {
		System.out.println("chennai");
	
	}

	@Override
	public void marital_status() {
		System.out.println("single");	
	}
	public static void main(String[] args) {
		Combined_detail a =new Combined_detail();
		a.name();
		a.age();
		a.city();
		a.marital_status();
		a.college();
		a.course();
		a.batch();
		a.percentage();
		
		
	}
    }