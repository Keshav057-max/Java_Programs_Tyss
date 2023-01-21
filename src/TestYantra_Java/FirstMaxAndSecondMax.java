package TestYantra_Java;

		public class FirstMaxAndSecondMax {
	

		public static void main(String[] args)
	{
			int[] a= {6,2,4,2,15,15,10};  //0 2 1
		int fmax=a[0]; int smax=a[0]; //6 6 4 2
			for(int i=0;i<a.length;i++)
		{
				//i=0  a[i]=6
				//i=1   a[i]=2
				//i=3   a[i]=4
				//i=4   a[i]=1
				if(a[i]>fmax)
			{
					smax=fmax; //
					fmax=a[i]; //2 1
			}
				else if(a[i]>smax && a[i]<fmax)
				{
					smax=a[i];  //4
				}
		}
			System.out.println("The first max no "+fmax);
			System.out.println("The second max no "+smax);

	}
}



