package String;

public class CountNumberOfUppercaseAndLowercase {
	
	public static void main(String[] args)
	{
		String s="BanglorE";
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uppercase++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
		}
		System.out.println("uppercse are ="+uppercase);
		System.out.println("lowercase are ="+lowercase);
	}

}
