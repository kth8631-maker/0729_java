package com.kh.chap03.run;

import java.util.Scanner;

import com.kh.chap03.model.vo.PracticeVO;

public class RunPractice {

	public static void main(String[] args) {
		// Coffee라는 클래스(설계도)를 가지고 객체 생성
		PracticeVO coffee = new PracticeVO(); // <- 객체(Object) 생성		instance화
		// 1. 참조자료형 reference type
		// 클래스를 만든다는 행위 == 사용자 정의 자료형을 만들겠다.
		// 2. 여러 개의 자료형에 여러 개의 값을 보관 + 기능
		// 3. 주소값을 저장
		System.out.println(coffee.info());
		// 기본값이 들어있음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("산지가 어디인가요 > ");
		String origin = sc.nextLine();
		coffee.setOrigin(origin);
		System.out.print("품종이 무엇인가요 > ");
		String varieties = sc.nextLine();
		coffee.setVarieties(varieties);

	}

}
