package scanner;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		/*
		 초기화 방법
		 - 자료형의 첫 문자가 소문자면 0으로 초기화한다.
		 - 자료형의 첫 문자가 대문자면 null으로 초기화한다.
		 */
		Scanner sc = null;
		
		String name = null;
		
		int num = 0;
		char ch = 0;
		double d = 0;
		float f = 0;
		
		System.out.println(name);
		System.out.println(num);
		
		int kor = 100, eng = 50, sum;
		
		sum = kor + eng;
		
		System.out.println("kor + eng = " + sum);
		
	}
}