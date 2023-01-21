package String;


import java.util.LinkedHashSet;

public class PositionOfEachElements {
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
		for(int i=0;i<str.length();i++)
		{
		
		if(hsr==str.charAt(i))
		{
		    System.out.println(hsr+ "-->in "+(i+1)+ "st position");
		    break;
	    }
	
			}
		
		}
	}
}