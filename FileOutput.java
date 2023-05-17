import java.io.*;
class FileOutput
{
public static void main(String args[])
{
System.out.println("This program is written by: Mr. Ashutosh Kumar");
FileOutputStream out; // declare a file output object
PrintStream p; // declare a print stream object
try
{
// Create a new file output stream connected to "myfile.txt"
out = new FileOutputStream("myfile.txt");
// Connect print stream to the output stream
p = new PrintStream( out );
p.println ("This is written to a file myFile.txt");
p.close();
}
catch (Exception e)
{
System.err.println ("Error writing to the file myFile.txt");
}}}