package hw;
import java.util.Scanner;
public class hw02_105021055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別,男生輸入1 女生輸入2");
		float n = scn.nextFloat();
		System.out.println("請輸入身高");
		float m = scn.nextFloat();
		double w = 0;
		if ( n == 1 ){w=((m-80)*0.7);
		}
		else if (n==2){w=(m-70)*06;
		
		}
		System.out.println(w);
			}

}
