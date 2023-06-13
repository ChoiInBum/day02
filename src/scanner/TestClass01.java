package scanner;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		//Scanner클래스 : 입력클래스
		
		String name;
		int num;
		
		System.out.print("이름 입력 : ");
		name = input.next(); //문자열 입력
		
		System.out.print("정수 입력 : ");
		num = input.nextInt(); //정수 입력
		
		System.out.println("이름 : "+name);
		System.out.println("정수 : "+num);
	}
}