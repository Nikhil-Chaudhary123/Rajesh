package logical;

import java.util.Scanner;

public class Palindrom {


	   public static void main(String args[])
	   {
	    
		 String s1=new String("hello");
		   String s2="hello";
		   String s3=s2.intern();
		   System.out.println(s1==s2);
		   System.out.println(s2==s3);
	   }
}
