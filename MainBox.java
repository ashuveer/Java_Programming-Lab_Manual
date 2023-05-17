class Box
{
int width,breadth,height;
void getdata(int length)
{
width=breadth=height=length;
}
void getdata(int a,int b)
{ width=a;
breadth=height=b;
}
void getdata(int x,int y, int z)
{ width=x;
breadth=y;
 height=z;
}
int volume()
{
System.out.println(" ");
return width*breadth*height;
}}
class MainBox
{ public static void main(String args[])
{ int vol;
System.out.println("This Program is written by: Mr. Ashutosh Kumar");
Box mybox1=new Box();
 Box mybox2=new Box();
 Box mybox3=new Box();
mybox1.getdata(10,20,30);
 vol=mybox1.volume(); 
 System.out.println("volume of my box with 3 perameters is = " +vol); 
mybox2.getdata(10,20);
vol=mybox2.volume();
 System.out.println("volume of my box with 2 perameters is = " +vol);
 mybox3.getdata(5);
vol=mybox3.volume();
 System.out.println("volume of my box with 1 perameter is = " +vol);
}
}
