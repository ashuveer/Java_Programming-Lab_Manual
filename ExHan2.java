import java.lang.Exception;
class ExHan2
{
public static void main(String args[])
{
System.out.println("This program is written by: Mr. Ashutosh Kumar");
int invalid=0,number,count=0;
for(int i=0;i<args.length;i++)
{
try
{
number=Integer.parseInt(args[i]);
}
catch(NumberFormatException e)
{
invalid=invalid + 1;
System.out.println("\n Invalid Number= " +args[i]);
continue;
}
count=count +1;
}
System.out.println("\n Valid Number= " +count);
System.out.println("\n Invalid Number= " +invalid);
}
}