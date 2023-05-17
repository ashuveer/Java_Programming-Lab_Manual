import java.lang.*;
class Error2
{
public static void main(String args[])
{
System.out.println("This program is written by: Mr. Ashutosh Kumar");
int a=10;
int b=5;
int c=5;
int x,y;
try
{
x=a/(b-c);
}
catch (ArithmeticException e)
{
System.out.println("division by zero");
}
y=a/(b+c);
System.out.println("y=" +y);
}
}