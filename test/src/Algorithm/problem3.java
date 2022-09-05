package Algorithm;
import java.util.Scanner;

public class problem3 {
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 넣으세요 : ");
		int total = sc.nextInt();
		
		int a= total/50000;
		System.out.println("50000원"+a+"개");
		
		int b= (total%50000)/10000;
		System.out.println("10000원"+b+"개");
		
		int c= ((total%50000)%10000)/5000;
		System.out.println("5000원"+c+"개");
		
		int d= (total%5000)/1000;
		System.out.println("1000원"+d+"개");
		
		int e= (total%1000)/500;
		System.out.println("500원"+e+"개");
		
		int f= (total%500)/100;
		System.out.println("100원"+f+"개");
		
		int g= (total%100)/50;
		System.out.println("50원"+g+"개");
		
		int h= (total%50)/10;
		System.out.println("10원"+h+"개");
		
	}
}
