package TestYantra_Java;

import java.util.LinkedHashSet;

public class OccranceOfArrayElement {
	
	public static void main(String[]args)
	{
	
	int [] ar= {30,50,80,60,10};
	LinkedHashSet <Integer> hs=new LinkedHashSet();
	for(int i=0;i<ar.length;i++)
	{
		hs.add(ar[i]);
	}
	
	for(Integer hsr:hs)
	{
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
		if(hsr==ar[i])
		{
			count++;
		}
		}
		System.out.println(hsr+" is repeating "+count);
	}
	

}
}
