public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String ans="";
    
for(int i=0;i<input.length();)
{
    char ch=input.charAt(i);
   
    ans=ans+ch;
    int k=0;
     
    for(k=i+1;k<input.length();k++)
    {
        
         if(input.charAt(k)!=ch)
        {
            break;
        }
    }
    i=k;

     }
     System.out.println(ans);
	}
}
