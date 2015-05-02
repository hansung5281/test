package algorithm;

import java.util.Scanner;

public class MaBangJin {
		 static int[][] a = new int[20][20];
		 
		 void mabangjin(int n) {
		  int hng, h;   //��
		  int yul, y;    //��
		  int suja;      //ä��� ����

		  //0���� ��� 1�� �д�.
		  hng = 0;
		  yul = (n-1)/2;
		  a[0][yul] = 1;

		  for(suja=2; suja <= n*n; suja++) {
		   //���� ���� ���� �����̸� ���� �Ʒ�������...
		   //�ƴϸ� �ϳ� �� ������ �̵�
		   if (hng ==0) h = n-1;
		   else             h = hng -1;

		   //���� ���� ���� ���� ���̸�  ���� ������ ����
		   //�ƴϸ� �ϳ� ���� ���� �̵�
		   if (yul ==0)  y = n-1;
		   else             y = yul -1;

		   //�̵����� ��ġ�� ��ĭ�̸� 
		   if (a[h][y] ==0) {
		    hng = h;
		    yul = y;
		   }
		   else {       //��ĭ�� �ƴϸ� �ϳ� �Ʒ� ������...
		    hng++;
		   }
		   a[hng][yul] = suja;
		  }
		 }

		 public static void main(String[] agrs) {
		   int value=5, sum=0;
		   MaBangJin m = new MaBangJin();
		   m.mabangjin(value);
		   for(int i=0; i<value; i++) {
		    for(int j=0;j<value; j++) {
		     if (a[i][j] < 10)  System.out.print("  ");
		     else System.out.print(" ");
		     System.out.print(a[i][j]);
		    }
		    System.out.println("");
		   }  
		 }
}
