
public class Cake 
{
	private int bites = 10;
	
	public Cake()
	{
		
	}
	
	public void takeABite()
	{
		--bites;
		System.out.println("hmm....");
	}
	
	public boolean isEmpty()
	{
		return bites == 0;
	}
	
	
}
