
public abstract class Question 
{
	//fields
	private static int nextNum=1;
	private static int number;
	private String text;
	
	//constructor
	public Question(String txt)
	{
		this.number=nextNum;
		text=txt;
		nextNum++;
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
