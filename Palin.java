import java.util.*;
public class Palin
{
public static void main(String args[])
{
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
System.out.print("enter strings = ");
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer tmp=new StringBuffer(s);
tmp.reverse();
String str2;
str2=new String(tmp);
if(s.equals(str2))
System.out.println("the given string " + s + " is palindrome");
else
System.out.println("the given string " + s + " is not palindrome");
}
}