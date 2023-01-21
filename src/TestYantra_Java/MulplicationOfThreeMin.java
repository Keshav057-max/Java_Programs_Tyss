package TestYantra_Java;

public class MulplicationOfThreeMin {
	
	public static void main(String[]args)
	{
	int a[]= {50,20,90,35,40};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=1+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
		int mul=1;
		for(int i=0;i<3;i++)
		{
			mul=mul+a[i];
		}
		System.out.println(mul);
	}
}

