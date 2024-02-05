import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Hypotenuse program
		
		double a;
		double b;
		double c;
		
		Scanner hscan = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		a = hscan.nextDouble();
		
		System.out.println("Enter value for b: ");
		b = hscan.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("The hypotenuse is: " + c);
		
		hscan.close();
		
	}

}
