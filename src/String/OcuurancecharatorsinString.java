package String;


import java.util.LinkedHashSet;

public class OcuurancecharatorsinString {
	public static void main(String[] args)
	{
		String s="Anupama";
		String str = s.toLowerCase();
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}
		
	for(Character hsr:hs)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
		
		if(hsr==str.charAt(i))
		{
			count++;
		}
		
	}
		System.out.println(hsr+"="+count);
	}
	
	}
}