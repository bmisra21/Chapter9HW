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
		String ch1 = AnswerChoices[0];
		String ch2 = AnswerChoices[1];
		String ch3 = AnswerChoices[2];
		String ch4 = AnswerChoices[3];
		return ""+ getNumber() + ")" + getText() + "\na)" +
		ch1 + "\nb)" + ch2 + "\nc)" + ch3 + "\nd)" + ch4;
	}
	public String getSolution()
	{
		return ""+correctAnswer;
	}
}
