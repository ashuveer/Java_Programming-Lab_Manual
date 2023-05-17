class Student
{ 
 int id; 
 String name; 
 int age;
 Student(int i,String n,int a)
 { 
 id = i; 
 name = n; 
 age=a;
 } 
 
 Student(Student s)
{ 
 id = s.id; 
 name =s.name; 
 age=s.age;
 } 
 void display()
{
System.out.println(id+" "+name+" "+age);
} 
 public static void main(String args[])
{ System.out.println("This Program is written by: Mr. Ashutosh Kumar");
 Student s1 = new Student(111,"Kalpana",39); 
 Student s2 = new Student(s1);
 s1.display(); 
 s2.display(); 
 } 
} 
