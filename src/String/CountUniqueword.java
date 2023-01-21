	
	package String;

	import java.util.LinkedHashSet;
import java.util.LinkedList;

	public class CountUniqueword {
		
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
				int count=0;
				for(int i=0;i<str.length;i++)
				{
			
				if(str[i].contains(hsr))
				{
				count++;
				}
				
			}
				if(count==1)
				{
				System.out.println(" unique words is-->"+hsr);
				}
			
		}

		}
	}



