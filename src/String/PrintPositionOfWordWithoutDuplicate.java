	
	package String;

	import java.util.ArrayList;
import java.util.LinkedHashSet;


	public class PrintPositionOfWordWithoutDuplicate {
		
		public static void main(String[]args) {
			
			String s = "i am am from sdet44";
			String[] str = s.split(" ");
			LinkedHashSet<String> hs=new LinkedHashSet<>();
			for(int i=0;i<str.length;i++)
			{
				hs.add(str[i]);
			}
		    
			for(String hsr:hs)
			{
			for(int i=0;i<str.length;i++)
				if(str[i].equals(hsr))
				{
				System.out.println(hsr +"-->at "+(i+1)+ " position");
				break;
				}
			}
		}

		
		}
	



