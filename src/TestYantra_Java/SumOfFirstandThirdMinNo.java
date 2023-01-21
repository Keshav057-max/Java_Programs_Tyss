package TestYantra_Java;

public class SumOfFirstandThirdMinNo {
	
	public static void main(String[]args)
	{
	int a[]= {50,20,90,35,40};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	//a[0]=20 a[1]=35  a[2]=
	System.out.println("The Sum first and Third minimum number is ="+(a[0]+a[2])+" ");
	/**for(int k=0;k<a.length-4;k++)
	{
		System.out.println(a[0]+" ");
	}
*/
}
}

