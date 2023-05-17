import java.util.*;
class SumDigits
{
public static void main(String args[])
{
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
int n, res,sum=0;
Scanner scan= new Scanner(System.in);
System.out.print("Please Enter No. = ");
n=scan.nextInt();
System.out.print("Sum of digits of a number" +n+ "is = "); while(n>0)
{
res=n%10;
n=n/10;
sum=sum+res;
}
System.out.print(+sum);
}
}
