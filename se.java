import java.io.*;
import java.net.*;
 class server
{
public static void main(String[]args)throws IOException
{
ServerSocket ab=new ServerSocket(3333);
Socket s=ab.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader pr=new BufferedReader(new InputStreamReader(System.in));
String Str="" ,Str1="";
while(!Str.equals("stop"))
{
Str=din.readUTF();
System.out.println("client says:"+Str);
Str1=pr.readLine();
dout.writeUTF(Str1);
dout.flush();
}
din.close();
s.close();
}

}