import java.lang.*;
class TestOl
{
 int hrs,mins,scnds; 
 TestOl(int h,int m,int s) 
 {
hrs=h; 
mins=m; 
scnds=s; 
 }
 public TestOl(int h)
 { 
 hrs=h; 
 mins=0; 
 scnds=0; 
 } 
 public TestOl(int h,int m) 
 {
 hrs=h; 
 mins=m; 
 scnds=0; 
 } 
 public TestOl()
 { 
 hrs=0;
 mins=0; 
 scnds=0; 
 } 
 void primetime() 
 { 
 System.out.println("hrs:"+hrs+"\t mins:"+mins+"\t scnds:"+scnds);
 } 
 } 
 class OverLoad
 { 
 public static void main(String args[])
 { 
 TestOl obj1=new TestOl(); 
 obj1.primetime();
 TestOl obj2=new TestOl(5); 
 obj2.primetime();
 TestOl obj3=new TestOl(7,6);
 obj3.primetime(); 
 } }