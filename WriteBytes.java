import java.io.*;
class WriteBytes
{
public static void main(String args[])
{
// declare and initialize a byte array
byte cities[]={'D','E','L','H','I','\n','C','H','E','N','N','A','I','\n','L','O','N','D','O','N','\n'};
//create an output file stream
FileOutputStream outfile=null;
try
{
//connect the outfile stream to city.txt
outfile=new FileOutputStream("city.txt");
//write data to the stream
outfile.write (cities);
outfile.close( );
}
catch(IOException ioe)
{
System.out.println(ioe);
System.exit(-1);
}
}
}