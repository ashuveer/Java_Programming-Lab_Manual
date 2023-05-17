import java.util.Scanner;
class Seriesfact
{
public static void main(String args[])
{
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
int i;
float sum=0,f=1;
System.out.println("enter number of terms in the series");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++)
{ for(f=1;f<=i;f++)
{
f=f*i;
sum=sum + (float)1/f;
}
}
System.out.println("sum of" +n +"terms is = " +sum);
}
}
