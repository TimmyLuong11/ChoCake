import java.util.Scanner;

public class Word
{
	public Word()
	{
		
	}
	
	public static boolean isWord(String given)
	{
		word = given.toLowerCase();
		if(given.length() ??? ?)
		{
			return ?;
		}
		else if
		{
			return false;
		}
		else
		{
			isWord(str);
		}
		return false;
	}

	public static void main(String[] args)
	{
		Scanner word = new Scanner(System.in);
		boolean valid = true;
		while(valid)
		{
			System.out.println("Magic word");
			String given = word.nextLine();
			
			if(given.equals("stop"))
			{
				valid = false;
			}
			System.out.println(">" + given + "<" + isWord);
		}
		word.close();
	}
}
