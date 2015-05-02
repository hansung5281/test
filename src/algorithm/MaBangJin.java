package algorithm;

import java.util.Scanner;

public class MaBangJin {
		 static int[][] a = new int[20][20];
		 
		 void mabangjin(int n) {
		  int hng, h;   //행
		  int yul, y;    //열
		  int suja;      //채우는 숫자

		  //0행의 가운데 1을 둔다.
		  hng = 0;
		  yul = (n-1)/2;
		  a[0][yul] = 1;

		  for(suja=2; suja <= n*n; suja++) {
		   //현재 행이 제일 위행이면 제일 아래행으로...
		   //아니면 하나 위 행으로 이동
		   if (hng ==0) h = n-1;
		   else             h = hng -1;

		   //현재 열이 제일 왼쪽 열이면  제일 오른쪽 열로
		   //아니면 하나 왼쪽 열로 이동
		   if (yul ==0)  y = n-1;
		   else             y = yul -1;

		   //이동후의 위치가 빈칸이면 
		   if (a[h][y] ==0) {
		    hng = h;
		    yul = y;
		   }
		   else {       //빈칸이 아니면 하나 아래 행으로...
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
