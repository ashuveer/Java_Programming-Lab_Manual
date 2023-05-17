import java.awt.*; 
import java.applet.*;
/*Coding of HTML File <applet code = abc1.class width= 200 height=200> </applet> */
public class abc1 extends Applet 
{ 
public void paint(Graphics g)
{
System.out.println("This Program is written by: Mr. Ashutosh Kumar");	
int a=100; 
int b=200; 
int sum = a+b; 
String s = "The Sum is :" + String.valueOf(sum); 
g.drawString( s, 200,100); 
} }
