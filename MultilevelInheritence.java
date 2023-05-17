class Name
{ 
String name="Ashutosh";
int age=20; 
} 
class Mark extends Name 
{
int m1=30,m2=30,m3=30; 
} 
class Student extends Mark 
{ 
int total; 
void calc() 
{ 
total=m1+m2+m3; 
} 
void show() 
{ 
System.out.println("\n NAME: " +name+"\n AGE:"+age+"\n MARK1="+m1+"\n MARK2=" +m2+"\n MARK3="+m3+"\n TOTAL:"+total);
} 
} 
class MultilevelInheritence
{ 
public static void main(String args[])
{ 
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
Student ob=new Student(); 
ob.calc(); 
ob.show();
}
}
