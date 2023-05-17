class Super 
{ 
static final int a=20; 
static int b;
int c=100; 
} 
class SuperDemo extends Super 
{ 
void display() 
{ 
System.out.println("\nFinal Variable=" +super.a); 
System.out.println("Super class Variable=" +super.c);
System.out.println("Static Variable="+b);
} 
public static void main(String[] args) 
{ 
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
SuperDemo s=new SuperDemo();
s.display();
} }
