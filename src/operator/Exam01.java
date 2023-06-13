package operator;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2, num3;
		
		System.out.print("수 입력 : ");
		num1 = sc.nextInt();
		
		String str;
		str = (num1%2==0) ? "짝수" : "홀수";
		System.out.println(num1+" = "+str);
		str = (num1%3==0) ? "3의 배수"	: "3의 배수 아님";
		System.out.println(num1+" = "+str);
		
		System.out.print("두 수 입력 : ");
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println("num1 : "+num1+", num2 : "+num2);
		str = (num1 > num2) ? "num1이 num2보다 크다." : "num2가 num1보다 크다.";
		System.out.println(str);
	}
}