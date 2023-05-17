class OverloadDemo
{ 
void max(float a, float b)
{ 
System.out.println("\nmax method with float argument invoked");
if(a>b) 
System.out.println(a+" is Greater"); 
else 
System.out.println(b+" is Greater");
} 
void max(double a, double b) 
{ 
System.out.println("max method with double arg invoked");
if(a>b) 
System.out.println(a+" a is Greater");
else 
System.out.println(b+" b is Greater"); 
} 
void max(long a, long b) 
{ 
System.out.println("\nmax method with long arg invoked"); 
if(a>b) 
System.out.println(a+" a is Greater"); 
else System.out.println(b+" b is Greater"); 
} 
public static void main(String[] args) 
{ 
OverloadDemo o=new OverloadDemo(); 
o.max(23L,12L); 
o.max(2,3); 
o.max(54.0,35f); 
} 
}
