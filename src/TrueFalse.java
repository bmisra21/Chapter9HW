
public class TrueFalse extends Question
{
	//fields
	String answer;
	
	//constructor
	public TrueFalse(int num, String text, String ans)
	{
		super(num, text);
		answer = ans;
	}
	
	//methods
	public String toString()
	{
		return "" + getText() + "(True/False)?";
	}
	public String getSolution()
	{
		return answer;
	}

}
