	
	package String;

	import java.util.LinkedHashSet;

	public class CountNpOfDuplicates {
		
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
				int count=0;
				for(int i=0;i<str.length;i++)
				{
			
				if(str[i].contains(hsr))
				{
				count++;
				}
				
			}
				if(count>1)
				{
				System.out.println(hsr +" repeted "+count+"-->times");
				}
			
		}

		}
	}



