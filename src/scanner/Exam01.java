package scanner;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor;
		int eng;
		int math;
		
		System.out.println("================");
		System.out.print("이 름 : ");
		name = sc.next();
		System.out.println("================");
		
		System.out.print(name+"님의 국어 점수 : ");
		kor = sc.nextInt();
		
		System.out.print(name+"님의 영 어 : ");
		eng = sc.nextInt();
		
		System.out.print(name+"님의 수 학 : ");
		math = sc.nextInt();
		System.out.println("================");
		
		System.out.println("합 계 : "+(kor+eng+math));
		System.out.println("================");
	}
}