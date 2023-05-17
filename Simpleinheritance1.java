class Rectangle
{
int length;
int width;
void area()
{
System.out.println("area of Rectangle is " +(length*width));
}
}
class Cuboid extends Rectangle
{
int height;
void volume()
{
System.out.println("Volume of cuboid is " +(length*width*height));
}
}
class Simpleinheritance1
{
public static void main(String args[])
{
System.out.println("This program is written by: Mr. Ashutosh Kumar");
Rectangle r=new Rectangle();
Cuboid c=new Cuboid();
r.length=10;
r.width=5;
r.area();
c.length=15;
c.width=10;
c.height=5;
c.volume();
}
}
