import java.util.Arrays;

public class MultipleChoice extends Question
{
	//fields
	String[] AnswerChoices;
	char correctAnswer;
	
	//constructor
	public MultipleChoice(String text, String[] choices, char correct)
	{
		super(text);
		AnswerChoices = Arrays.copyOf(choices, choices.length);
		correctAnswer = correct;
		
	}
	
	 //methods
	public String toString()
	{
		String ques = "" + getNumber() + ")"  + getText() + "\n";
		char letter = 'a';
		for (int i =0; i<AnswerChoices.length; i++)
		{
			ques += "" + letter + ")" + AnswerChoices[i] + "\n";
			letter ++;
		}
		return ques;
	}
	public String getSolution()
	{
		return "" + correctAnswer;
	}
}
