package ARROW.ARROWDC;

public class RemoveA {

	public String Removea(String string) {
		
		String s="";
		for(int i=0;i<string.length();i++)
		{
			if(i<2)
			{
				if(!(string.charAt(i)=='A'))
				{
					s=s+string.charAt(i);
				}
			}
			else
				s=s+string.charAt(i);
		
		}
		
		return s;
	}
	


	

}
