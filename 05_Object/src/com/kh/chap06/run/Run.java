package com.kh.chap06.run;

import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		/*
		Human human = new Human();
		human.hi();
		*/
		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(5, 6);
		int d = mc.add(a, b);
		int e = mc.add(c, d));
		System.out.println("총합 : " );
		*/
		
		// MethodController mc = new MethodController();
		//int[] dd = new int[3];
		//mc.method1();
		// mc.method2(); //이 문자열을 호출했을때 반환받은 값을 
		
		// 뉴할때 힙영역에 올라가고 기본 생성자를 호출하나 쓴거없어서 고다음 주소값 대입 호잇 
		// 메소드2에 리턴벨류 돌아오고 메모리에서 날아가면서 같이 날아감
		// 리턴벨류가 돌아오면서 스트링이 돌아와요 참조자료형 스트링을 가리키고 있는 주소값
		// String returnValue = mc.method2();
		// System.out.println(returnValue);
		//System.out.println(mc.method2());
		//System.out.println("method3 호출 결과 : " + mc.method3());
		
		// String parameter = "method3 호출 결과 : " + mc.method3();
		//mc.method4(2);
		
		// int result = mc.method5(5);
		// System.out.println(result);
		// mc.a();
		
		// MethodController mc = mc;
		// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		// mc.test(mc); /* 얕은 복사 */
		
		// 복습하자~~~
		
		// 객체를 생성하지 않고 메서드를 호출 할 수 있음
		
		/*
		Math.random();
		int[] arr = {2, 3};
		System.out.println(Arrays.toString(arr));
		MethodController.staticMethod();
		*/
		
		// mc.haha(3.34);
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라?");
		System.out.println(mc);
		System.out.println();
		*/
		
		OverloadingController oc = new OverloadingController();
		
		// 정적 바인딩(Static Binding)
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석하여 메소드 호출 연결
		oc.test();
		oc.test(2); // (호출부에서 괄호는 '인자값 arguments')
		oc.test("3");
		oc.test(1, 2);
		oc.test(2, "sdf");
		oc.test("vvv", 3);
		
		
		
	}

}
