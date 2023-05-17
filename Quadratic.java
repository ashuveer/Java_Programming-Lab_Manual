import java.lang.*;
class Quadratic
{
public static void main(String args[])
{
int a,b,c,d;
double r1,r2;
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
d=b*b-4*a*c;
if(d==0)
{
r1=r2=(float)b/(2*a);
System.out.println("the roots are real equal =" +r1 + " and r2 = " +r2);
}
else if(d>0)
{
double t=Math.sqrt(d);
r1=(-b+t)/(2*a);
r2=(+b+t)/(2*a);
System.out.println("the roots are real and distict \n r=" +r1 +" and r2=" +r2);
}
else if(d<0)
{
System.out.println("the roots are imaginary and there is no real solution ");
}
}}
