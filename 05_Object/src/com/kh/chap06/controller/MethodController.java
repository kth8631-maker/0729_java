package com.kh.chap06.controller;

public class MethodController {
			/* 클래스는 어떠한 용도에요? 자료형으로 사용하고 있어요 자바에서 제일 중요한거 Type★ */
	
	/*
	 * 메소드(Method) 클래스가 가지고 있는 기능 == 멤버 함수
	 * 입력값을 가지고 특정 동작을 수행한 뒤 결과물을 내놓는다.
	 * 
	 * 프로그래밍 언어에서의 함수 : 특정 작업을 수행하기 위해서 만들어진 코드 블록
	 * 1. 재사용성
	 * 2. 모듈화 (작은 단위로 쪼개서 부품 조합)
	 * 
	 * 객체지향 프로그래밍에서의 메소드란 : 객체가 수행할 수 있는 행동을 정의한 코드 블록
	 * 
	 * 특정 자료형에서만 사용이 가능한 함수
	 * 
	 * [ 표현법 ]
	 * 
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의 자료형 매개변수식별자) {
	 * 			메소드 블럭 안에 수행할 코드 작성;
	 * 
	 * 			return 반환값;
	 * }
	 * 
	 * 생략 가능한 것 : 예약어, 매개변수, return문(void일 경우)
	 * 반환형 : return 시 반환할 값의 자료형을 적어줌
	 * 호출할 때 메소드 전달 인자값 => 매개변수의 자료형과 개수가 정확하게!!! 일치해야함 ☆
	 * 
	 * 메소드의 최대 장점은 한 번 정의해두면 필요할 때마다 언제든 호출이 가능~~
	 */
	
	// 더하기를 해서 결과를 반환해주는 코드 블럭을 만들고 싶다.
	public int add(int a, int b) { // 메소드 시그니처 (접근제한자+반환타입+함수명+매개변수)
		int sum = a + b; // 메소드 바디
		return sum; // 반환값
		
	}
	//접근제한자 반환타입 함수명 함수블럭 / 더하기 할거면 매개변수 자리에 넣어줌
	
	//1. 매개변수가 존재하지 않고 반환값도 존재하지 않는 메소드
	public void method1() {
		
		System.out.println("매개변수와 반환값이 둘 다 존재하지 않습니다.");
		
		// return;
		// returnType이 void일 경우 return문을 생략 할 수 있다.
	}
	
	// 2. 매개변수는 존재하지 않지만 반환값은 존재하는 메소드
	public String method2() {
		System.out.println("매개변수는 존재하지 않지만 반환값은 존재합니다.");
		
		return "returnValue";
		// return을 안붙일 수 있는건 오직 void
	}
	
	public String method3() {
		return method2();
	}
	
	public void println(String parameter) {
		System.out.println(parameter);
	}
	
	// 3. 매개변수는 존재하지만 반환값은 존재하지 않는 메소드
	/*
	public void setName(String name) {
		this.setName = name;
	}
	*/
	public void method4(int num) { // 메소드 시그니처를 메소드 사용법이라 표현하기도함
		System.out.println("매개변수는 존재하고 반환값은 존재하지 않습니다.");
		System.out.println("전달받은값 + 100" + (num + 100));
	}
		
		// 4. 매개변수도 존재하고 반환값도 존재하는 메소드 -> 가장 많이 사용
	public int method5(int num) {
		System.out.println("매개변수도 있어요 ~ 반환값도 있어요.");
		return num + 50;
	}
	
	public void a() {
		System.out.println("메소드 a호출!");
		b();
	}
	
	public void b() {
		System.out.println("메소드 b호출!");
		a();
	}
	
	public void test(MethodController mc) {
		mc.method1();
	}
	
	public static void staticMethod() {
		System.out.println("안녕 나는 스태틱 메소드임");
	}
	
	
}
