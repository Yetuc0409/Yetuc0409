import java.io.*;
import java.net.*;
 class client
{
public static void main(String[]args)throws IOException
{
Socket s=new Socket("Localhost",3333);
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader pr=new BufferedReader(new InputStreamReader(System.in));
String Str="" ,Str1="";
while(! Str.equals("stop"))
{
Str=pr.readLine();
dout.writeUTF(Str);
dout.flush();
Str1=din.readUTF();
System.out.println("server says:"+Str1);
}
dout.close();
s.close();
}
}