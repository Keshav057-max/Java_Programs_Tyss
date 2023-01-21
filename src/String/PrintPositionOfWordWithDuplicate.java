	
	package String;
import java.util.LinkedList;


	public class PrintPositionOfWordWithDuplicate {
		
		public static void main(String[]args) {
			
			String s = "i am am from sdet44";
			String[] str = s.split(" ");
			LinkedList<String> hs=new LinkedList<>();
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
	



