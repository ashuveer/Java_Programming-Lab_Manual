import java.util.*;
class Factorial
 {
public static void main(String args[])
{System.out.println("This Program is written by: Mr. Ashutosh Kumar"); 
int n, i, fact=1;
Scanner scan= new Scanner(System.in);
System.out.print("Please Enter a No.");
n=scan.nextInt();
for(i=n;i>=1;i--)
 {
fact=fact*i ;
 }
System.out.println("Factorial of " + n + " is " + fact);
 }
 }
