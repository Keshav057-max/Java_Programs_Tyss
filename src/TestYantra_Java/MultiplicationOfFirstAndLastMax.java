package TestYantra_Java;

public class MultiplicationOfFirstAndLastMax {
	
	public static void main(String[]args)
	{
	int a[]= {5,2,9,3,4};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=1+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	//a[0]=20 a[1]=35  a[2]=
	System.out.println("The Product first and Third maximum number is ="+(a[0]*a[2]));
	/**for(int k=0;k<a.length-4;k++)
	{
		System.out.println(a[0]+" ");
	}
*/
}
}

