package TestYantra_Java;

public class FindFirstMinArrayWithoutBubbleSort {

	public static void main(String[] args) {
		int[] a= {6,2,4,10};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		System.out.println(max);
	}

}
