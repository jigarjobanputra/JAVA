import java.io.*;
import java.util.*;

class MyException extends Exception
{
   private String nm="";
  public String getMessage(String s)
   {

   nm=s;
   return ("you are not permitted to enter inside "+nm);
   }
}

public class ExcepDemo
  {
  public static void main(String args[])throws MyException,IOException
  {
  String temp="";
  try
   {
   String str="Jigar";
   System.out.println("Enter the your name");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  temp=br.readLine();

   if(!temp.equals(str))
  throw new MyException();
  else
   System.out.println("Welcome to Rose India");
   }
   catch(MyException e)
   {
  System.err.println(e.getMessage(temp));
   }
  catch(Exception e){
  System.err.println(e);
  }
   }
  }
