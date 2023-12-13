
import java.io.*;

public class main {

	public static void main(String[] args) {
		
		double result
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		String name = "Aimar";
		String birth = "24/05/2001";
		String height = "1.78";
		String weight = "65";
		int year = 0;
		double height2 = 0;
		double weight2 = 0;
		
		System.out.println("Input something: ");
		try {
			System.out.println("Input your name: ");
			name = input.readLine();
			System.out.println("Input your year: ");
			year = Integer.parseInt(input.readLine());
			System.out.println("Input your height: ");
			height2 = Double.parseDouble(input.readLine());
			System.out.println("Input your weight: ");
			weight2 = Double.parseDouble(input.readLine());
			
			result = weight2 / (height2/weight2);
			
			
		} catch (Exception e) {
			System.out.println("An	exception	has	occurred");
		}
		System.out.println("You	have	input:	" + name);
		System.out.println("You	have	input:	" + birth);
		System.out.println("You	have	input year:	" + year);
		System.out.println("You	have	input bmi:	" + result);
	}

}






	


