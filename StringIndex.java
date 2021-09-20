package org.system;

public class StringIndex {

	public static void main(String[] args) {
		String text =" Java Exercise ";
		
		char ch[] = text.toCharArray();
		
		for(int i=0; i<=ch.length-1; i++)
		{
			
			if(ch[i]=='E')
			{
				System.out.println("E is:" +i);
				
							}
			if(ch[i]=='s')
			{
				System.out.println("S is:" +i);
				
							}
			
		}
		

	}

}
