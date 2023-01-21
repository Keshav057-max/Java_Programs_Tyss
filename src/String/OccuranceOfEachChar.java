package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class OccuranceOfEachChar {
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
		System.out.print(hsr);
	}
	}
}