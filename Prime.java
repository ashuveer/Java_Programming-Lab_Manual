import java.util.*;
public class Prime
{
public static void main(String args[])
{System.out.println("This Program is written by: Mr. Ashutosh Kumar");
int i,j,p=1;
Scanner sc =new Scanner(System.in);
System.out.print("enter a number up to which u want print primes =");
int n=sc.nextInt();
for(i=2;i<=n;i++)
{
p=1;
for(j=2;j<i;j++)
{
if(i%j==0)
{
p=0;
}}
if(p==1)
System.out.println(j);
}
}
}
