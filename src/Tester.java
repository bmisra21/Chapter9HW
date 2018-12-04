import java.util.Scanner;
public class Tester {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String[] choices = new String[4];
		System.out.println("Enter 4 answer choices:");
		for (int i =0; i<4; i++)
			choices[i]= in.next();
		MultipleChoice mc1 = new MultipleChoice( "What is 2 to the power of 3?", choices, '8' );
		System.out.println(mc1.toString());
		System.out.println(mc1.getSolution());
		TrueFalse tf1 = new TrueFalse( "George Washington was president" , "True");
		System.out.println(tf1.toString());
		System.out.println(tf1.getSolution());
	}

}
