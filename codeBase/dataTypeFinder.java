package codeBase;
//import java.util.*;
public class dataTypeFinder
{
	public static void main(String[] args) {
	    String s1="Tushar";
		int i1=10;
		String s3=new String ("Khadnave");
		char c1='c';
		boolean b1=true;
		System.out.println(((Object)s1).getClass().getSimpleName());
	    System.out.println(((Object)i1).getClass().getSimpleName());
		System.out.println(((Object)c1).getClass().getSimpleName());
		System.out.println(((Object)b1).getClass().getSimpleName());

	}
}