class DaemonThread extends Thread 
{
int i;
public void run()
{
for(i=0;i<5;i++); 
{
System.out.println(this.getName()+" "+i); 
} 
}
public static void main(String[] args)
{ 
System.out.println("This program is written by: Mr. Ashutosh Kumar");
DaemonThread d=new DaemonThread(); 
DaemonThread d1=new DaemonThread(); 
d.setName("\nDAEMON THREAD"); 
d1.setName("NORMAL THREAD"); 
d.setPriority(Thread.MIN_PRIORITY); 
d.start(); 
d1.start(); 
} 
}
