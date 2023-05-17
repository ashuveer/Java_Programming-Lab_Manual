import java.lang.*;
class Stringsort
{
static String name[]={"Bombay" , "Madras" ,"Delhi" ,"Pune"};
public static void main(String args[])
{
int size=name.length;
String temp=null;
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;j++)
{
if ( name[j].compareTo(name[i])<0)
{
temp=name[i];
name[i]=name[j];
name[j]=temp;
}
}
}
System.out.println("This Progrm is written by: Mr. Ashutosh Kumar");
System.out.println("soted names are ");
for(int i=0;i<size;i++)
{
System.out.println(name[i]);
}
}
}
