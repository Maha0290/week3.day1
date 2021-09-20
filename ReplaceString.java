package org.system;

public class ReplaceString {

	public static void main(String[] args) {

		
		  String sentence = "I am working with Java8";
		  
		  String replaceString = sentence.replaceAll("8", "11");
		  
		  System.out.println(replaceString);
		  
		  char[] ch=sentence.toCharArray();
		  
		  for(int i=5; i<=13; i++) {
		  
		  
		  System.out.print(ch[i]);
		  
		  
		  }
		  
		 

	}
}
