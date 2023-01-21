package String;

public class StringRotation09 {
	
	public static void main(String args[])
	{
			String str1 = "keshav is bad boy";
			//String[] st = str1.split(" ");
			String strv = " ";
		
			
			for(int i=str1.length()-2;i>=0;i--)
			{
			strv=strv+str1.substring(i-9) + str1.substring(i-2, i);
	
			System.out.println(strv + " ");
			
			}
			
	}

}
