package Algorithm;
import java.util.Scanner;

public class Test {
	public static void main(String[] args)  {
		
		double pi = 3.141592;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		int radius = sc.nextInt();	
		System.out.print("원의 넓이는 : "+radius*radius*pi);
	}
	
}
