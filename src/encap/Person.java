package encap;

 public class Person {
	 
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
		
			Person a = new Person();
			a.setName("vicky");
			a.setAge(30000);
			System.out.println(a.getName());
			
			System.out.println(a.getAge());
	 
		}

 }
 //getter and setters short cut use pannu