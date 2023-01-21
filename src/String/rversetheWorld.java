package String;

public class rversetheWorld {
	
	public static void main(String[]args)
	{
		String st="i,am,from,sdet44,batch";
		String[] s = st.split(",");
		for(int i=0;i>s.length-1;i++)
		{
			String str = s[i];
			for(int j=s.length-1;j>=0;j--)
			System.out.print(str.charAt(i)+ " ");
			
		}
	}

}
