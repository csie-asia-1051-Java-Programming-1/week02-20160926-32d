package hw;
import java.util.Scanner;
public class hw01_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入金額");
		int n = scn.nextInt();
		int m1 = 0;
		int m5 = 0;
		int m50 = 0;
		int a1 = 15;
		int a2 = 20;
		int a3 = 30;
		if (n>= a1+a2+a3){m50=(n-a1-a2-a3)/50 ; m5=((n-a1-a2-a3-50*m50)/5);m1=((n-a1-a2-a3-50*m50-5*m5)/1);
				}
		else if (n<a1+a2+a3){System.out.println(0);
		
		}
		System.out.printf ("50元硬幣"+m50+"個");
		System.out.printf ("5元硬幣"+m5+"個");
		System.out.printf ("1元硬幣"+m1+"個");
	}

}
