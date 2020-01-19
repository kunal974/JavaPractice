import java.util.Arrays;
import java.util.Scanner;
public class PythagoreanTriplet {
	
	public static void main(String[] args) 
{
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		for(int q=0;q<a;q++) {
			int n = s.nextInt();
			int ar[] = new int[n];
			for(int i=0;i<n;i++) {
				ar[i]=s.nextInt();
			}
			int flag=0;
			Arrays.sort(ar);
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					for(int k=j+1;k<n;k++) {
						if((ar[i]*ar[i]) + (ar[j]*ar[j]) == (ar[k]*ar[k])) {
							flag=1;
							break;
						}
					}
				}
			}
			if(flag==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}

	}
}
