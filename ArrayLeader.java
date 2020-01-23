import java.util.*;
public class ArrayLeader
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("No. of elements present = ");
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j,flag=0;
		System.out.print("Enter the elements of the array = ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.print(a[n-1]);
	}
}
