import java.util.*;
class Biggest3
{
public static void main(String args[])
{
System.out.println("This Program is written by: Mr. Ashutosh Kumar"); 
int n1, n2, n3, big;
Scanner scan= new Scanner(System.in);
System.out.print("Please Enter No 1: ");
n1=scan.nextInt();
System.out.print("Please Enter No 2: ");
n2=scan.nextInt();
System.out.print("Please Enter No 3: ");
n3=scan.nextInt();
if(n1>n2 && n1>n3)
big=n1;
else if(n2>n1 && n2>n3)
big=n2;
else
big=n3;
System.out.println("Biggest No: " + big);
 }
 }
