package lab3;

import java.io.IOException;

public class p43 {
	public static void main(String[] args)throws IOException 
	{
		int[]test= {80,60,22,50,75};
		
		for(int i =0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"個人的分數試"+test[i]+"分");
		}
		
		System.out.println("考試人數為"+test.length+"人");
	}
}
