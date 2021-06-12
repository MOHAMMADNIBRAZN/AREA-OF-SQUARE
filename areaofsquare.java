package areaofsquare;
import java.util.Scanner;
public class areaofsquare {

	public static void main(String[] args) {
		
		System.out.println("enter side of square:");
		try (Scanner Scanner = new Scanner(System.in)) {
			double side =Scanner.nextDouble();
			double area=side*side;
			System.out.println("area of square:"+area);
		}

	}

}
