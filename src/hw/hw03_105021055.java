package hw;
import java.util.Scanner;
public class hw03_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入西元年份");
		int y = scn.nextInt();
		
		if (y%4==0 && y%100!=0 ){System.out.println("是");
		
		}
		else if(y%4==0 && y%100==0 ){System.out.println("否");
		}
		else if (y%4!=0){System.out.println("否");
		
		}
	}

}
