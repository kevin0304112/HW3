package lab3;

import java.io.IOException;

public class p41 {
	public static void main(String[] args)throws IOException 
	{
		int[]test;
		test=new int[5];
		
		test[0]=80;
		test[1]=60;
		test[2]=22;
		test[3]=50;
		test[4]=75;
		
		test[10]=75;
		
		for(int i =0;i<5;i++) {
			System.out.println("��"+(i+1)+"�ӤH�����Ƹ�"+test[i]+"��");
		}
	}
}