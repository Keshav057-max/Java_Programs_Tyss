package TestYantra_Java;

public class LastMinNo {

	public static void main(String[] args) {
		
		int [] a= {60,30,10,50};
		
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
		System.out.println("Last min no is ="+(a.length-1));
	}

}