import java.util.Arrays;

public class MultipleChoice extends Question
{
	//fields
	String[] AnswerChoices;
	char correctAnswer;
	
	//constructor
	public MultipleChoice(int num, String text, String[] choices, char correct)
	{
		super(num, text);
		AnswerChoices = Arrays.copyOf(choices, 4);
		correctAnswer = correct;
		
	}
	
	 //methods
	public String toString()
	{
		String ch1 = "a)" +AnswerChoices[0];
		String ch2 = "b)" +AnswerChoices[1];
		String ch3 = "c)" +AnswerChoices[2];
		String ch4 = "d)" +AnswerChoices[3];
		return ""+ getNumber() + ")" + getText() + "\n" +
		ch1 + "\n" + ch2 + "\n" + ch3 + "\n" + ch4;
	}
	public String getSolution()
	{
		return "" + correctAnswer;
	}
}
