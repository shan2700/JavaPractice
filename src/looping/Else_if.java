package looping;

public class Else_if {

	public static void main(String[] args) {
		int power = 70;
		
		if(power>100){
			System.out.println("too high");
			
		}else if(power>=90 && power >95){
			
			System.out.println("high");
			
		}else if(power>=85 && power>90)
		
		{
			System.out.println("intermediate");
			
		}else if(power>=80 && power>85) {
			
			System.out.println("medium");
		}
		else if(power>=75 && power>80) {
			
			System.out.println("low");
		}
		else if(power>=65 && power>=70) {
			
			System.out.println("too low");
		}
		 else if(power>=65 && power>=70){
			
		System.out.println("bad");
		}
	}
}
