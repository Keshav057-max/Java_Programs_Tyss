package String;

public class ReverseString {

	public static void main(String[] args) {
//1.
		String s="Banglore";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}	
		
		
/**		//2.
		String st1="Banglore";
	 	char [] c=st1.toCharArray();
	 	 for(int i=st1.length()-1;i>=0;i--)
	 	{
		System.out.print(c[i]);
	 	
	 	}
		
	//3.
		String st="Banglore";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
		}
		System.out.print(rev);
	



//4.
 	String str="Banglore";
 	int count=0;
 	char [] ch=str.toCharArray();
 	for(char ck:ch)
 	{
 		count++;
 	}
 	for(int i=count-1;i>=0;i--)
 	{
 	System.out.print(ch[i]);
 	}
 	
 	//5.
 	String str1="Banglore";
 	StringBuilder sb=new StringBuilder(str1);
 	System.out.print(sb.reverse());
 	**/
 }
 	
}

