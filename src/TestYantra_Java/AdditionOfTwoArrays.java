package TestYantra_Java;
public class AdditionOfTwoArrays {
	

		public static void main(String[] args)
	{
			int[] a= {1,0,1,0,0};
			int [] b= {3,4,1,5,6,7};
			
			int length=a.length;
			
			if(a.length<b.length)
			{
				length=b.length;
			}
			for(int i=0;i<length;i++)
				try{
			{
				System.out.println(a[i]+b[i]);
			}
				}
			catch(Exception e)
			{
			if(a.length>b.length)
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(b[i]);
			}
			}		
	}
}



