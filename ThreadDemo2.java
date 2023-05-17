public class ThreadDemo2 extends Thread 
{
public void run() 
{ 
for(int i=0;i<20;i++)
{
System.out.println(getName()+":"+i);
}
}
public static void main(String[] args)
{
System.out.println("This progrm is written by: Mr. Ashutosh Kumar");
System.out.println("main started"); 
ThreadDemo2 td=new ThreadDemo2(); 
ThreadDemo2 td1=new ThreadDemo2(); 
td.setName("Thread1");
td1.setName("Thread2"); 
td.start();
td1.start();
td.yield();
System.out.println("Main Exited");
}
}