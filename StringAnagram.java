import java.util.*;
public class Anagram
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter first string");
String str=s.nextLine();
System.out.println("enter second string");
String str1=s.nextLine();
char ch1[]=str.toCharArray();
char ch2[]=str1.toCharArray();
if(ch1.length!=ch2.length)
{
System.out.println("not anagram");
}
else
{
Arrays.sort(ch1);
Arrays.sort(ch2);
String s1=new String(ch1);
String s2=new String(ch2);
if(s1.equals(s2))
{
System.out.println("anagram");
}
else
{
System.out.println("anagram");
}
}
}
}
