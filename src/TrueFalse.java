
public class TrueFalse extends Question
{
	//fields
	String answer;
	
	//constructor
	public TrueFalse(String text, String ans)
	{
		super( text);
		answer = ans;
	}
	
	//methods
	public String toString()
	{
		return "" + getNumber() + ") " + getText() + "(True/False)?";
	}
	public String getSolution()
	{
		return answer;
	}

}
