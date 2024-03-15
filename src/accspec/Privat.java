package accspec;

public class Privat {
	
	 private String name;
	 private int age;
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
		public static void main(String[] args) {
		
			Privat a = new Privat();
			
			a.setName("vicky");
			a.setAge(30);
			System.out.println(a.getName());
			
			System.out.println(a.getAge());
	 
		}

 } 


