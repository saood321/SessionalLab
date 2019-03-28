
public class Get {
	
	
	/**
	 * This method return index on which character and string word becomes equal
	 * @param str
	 * @preCondition nothing
	 * @param ch
	 * @return Starting from first return index on which character and string word becomes equal
	 */
	public static int getIndexFirst(String str,char ch)
	
	{
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				index=i+1;
				break;
			}
		}
		if(index==0)
		{
			System.out.println("not Found Exception");
			return -1;
		}
		else
		{
		return index;
		}
	}
	
	
	
	/**
	 * This method return index on which character and string word becomes equal
	 * @param str
	 * @param ch
	 * @return Starting from last return index on which character and string word becomes equal
	 */
	public static int getIndexLast(String str,char ch)
	
	{
		int index=(str.length()+1);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				index=(i+1);
				
			}
		}
		if(index==(str.length()+1))
		{
			System.out.println("Not Found Exception");
			return -2;
		}
		else
		{
		return index;
		}
	}
}
