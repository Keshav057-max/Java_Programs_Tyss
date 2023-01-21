package String;

import java.util.LinkedHashSet;

public class OrderOfOccurance {
	
	public static void main(String[] args)
	{
	String s="I am from sdet44 batch sdet44";
	String[] str = s.split(" ");
	LinkedHashSet <String> hs=new LinkedHashSet<>();
	
	for(int i=0;i<str.length;i++)
	{
		hs.add(str[i]);
	}
	for(String hsr:hs)
	{
		int count = 0;
		for(int i=0;i<str.length;i++)
		{
	    if(hsr.equals(str[i]))
	    {
	    	count++;
	    }
		}
		System.out.println(hsr+ "--> is repeating "+ count+" time");
	}
	}

}
