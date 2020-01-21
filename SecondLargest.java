import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i]=scan.nextInt();
		}
		int max=-9999;
		int smax=-9999;
		for(int i=1;i<n;i++)
		{
		    if(arr[i]>max)
		    {
		        smax=max;
		        max=arr[i];
		    }
		    else if(arr[i]>smax && arr[i]!=max)
		    {
		        smax=arr[i];
		    }
		}
		System.out.println(smax);
	}
}
