class Sup 
{ 
int x; 
Sup (int x) //constructor
{ 
this.x=x; 
} 
void display()
{ 
System.out.println("x in Super= "+x);
} } 
class sub extends Sup
{
int y; 
sub(int x,int y) 
{ 
super(x);
this.y=y; 
} 
void display() 
{ 
System.out.println("\nX in Super Class="+x); 
System.out.println("Y in Sub Class="+y);
} }
class TestOverride 
{ 
public static void main(String naren[]) 
{ 
System.out.println("This program is written by: Mr. Ashutosh Kumar");
sub obj=new sub(100,200); 
obj.display(); 
} }