package TestYantra_Java;
   
    public class FindFirstandSecondElementArraYWithoutduplicate {
    public static void main(String args[])
    {
        int arr[] = {2,5,9,0,5,0};
        int fmin = arr[0];
        int smin =arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] < fmin) {
            	smin=fmin;
            	fmin = arr[i];
            }
            else if (arr[i] < smin && arr[i]>fmin) {
                	smin = arr[i];
                }
        }
        System.out.println("smallest element is: "  + fmin);
        System.out.println("second smallest element is: "+ smin);
    }
}
 