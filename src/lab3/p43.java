package lab3;

import java.io.IOException;

public class p43 {
	public static void main(String[] args)throws IOException 
	{
		int[]test= {80,60,22,50,75};
		
		for(int i =0;i<test.length;i++) {
			System.out.println("��"+(i+1)+"�ӤH�����Ƹ�"+test[i]+"��");
		}
		
		System.out.println("�ҸդH�Ƭ�"+test.length+"�H");
	}
}