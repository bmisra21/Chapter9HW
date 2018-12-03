
public abstract class Question 
{
	//fields
	private static int number;
	private String text;
	
	//constructor
	public Question(int num,String txt)
	{
		number=num;
		text=txt;
	}
	//methods
	public abstract String getSolution();
	public int getNumber()
	{
		return number;
	}
	public String getText()
	{
		return text;
	}

}
