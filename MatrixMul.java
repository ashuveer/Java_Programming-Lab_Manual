import java.util.Scanner;
import java.io.*;
import java.lang.*;
class MatrixMul
{
public static void main(String[] args) 
{
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
int i= 0,j=0,k=0,p,q,m,n;
int a[][] = new int[10][10];
int b[][] = new int[10][10],c[][] = new int[10][10];
Scanner sc = new Scanner(System.in);
System.out.print("Enter no of rows in the A matrix= ");
p=sc.nextInt();
System.out.print("Enter a no of columns in the A matrix = ");
q=sc.nextInt();
System.out.print("Enter no of rows in the B matrix= ");
m = sc.nextInt();
System.out.print("Enter no of columns in the B matrix= ");
n = sc.nextInt();
 if(q==m)
 {
 System.out.print ("Enter A matrix values :");
for(i=0;i<p;i++)
{
 for(j=0; j<q ;j++)
 {
 a[i][j] = sc.nextInt() ;
 }
}
System.out.println("\nMatrix A values are ");
for(i=0;i<p;i++)
{
 for(j=0;j<q;j++)
 {
System.out.print(" "+a[i][j]) ;
 }
System.out.println();
 }
System.out.println("Enter matrxi B values :");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
b[i][j] = sc.nextInt() ;
}
}
 System.out.println("\nMatrix B values ");
for(i=0;i<m;i++)
{
 for(j=0;j<n;j++)
 {
System.out.print(" "+b[i][j]) ;
}
System.out.println();
 }
System.out.println("\n C Matrix is C = A * B Result");
if(q == m)
{
 for(i=0;i<p;i++)
 {
 for(j=0;j<n;j++)
{
 c[i][j]= 0 ;
 for(k=0;k<q;k++)
 {
 c[i][j] = c[i][j] + (a[i][k] * b[k][j]) ;
 }
 }
 }
}
// for C matrix Printing
for(i=0;i<p;i++)
{
 for(j=0;j<n;j++)
 {
 System.out.print(" "+c[i][j]) ;
 }
 System.out.println();
 }
 }else
{
 System.out.println("Matrix multiplication not possible");
}
 }
}
