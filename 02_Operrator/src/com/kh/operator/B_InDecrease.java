package com.kh.operator;

public class B_InDecrease {
	/*
	 * ���������� : ���׿����ڷ� �� ���� 1�� ����(���ϰų�) / ����(���ų�)�ϴ� ������ ��
	 * 
	 * [ ǥ���� ]
	 * ++ : ���� 1���� ��Ű�� ������
	 * -- : ���� 1���� ��Ű�� ������
	 * 
	 * => ������ ���� �Ұ���, ���߿� �Ѱ����� ���� �������� ��ġ�� �޶���
	 * 
	 * �������� ��ġ
	 * ���� ���� : ++��, --��     --> ���� ���� ���� �Ǵ� ���ҽ�Ű�� ���� �۾��� ó��
	 * ���� ���� : ��++, ��--     --> ���� ���� ó���ϰ� ���� �����ϰų� ���� 
	 */
	
	// �������� ù ��° �޼ҵ�
	public void method1() {
		//System.out.println("�߰�����");
		int num = 10;
		System.out.println("num : " + num);   // "num : 10"
		num++;
		System.out.println("num : " + num);   // "num : 11"
		num--;
		
		System.out.println("num : " + num);   // "num : 10"
		System.out.println("num : " + num++); // "num : 10"
		System.out.println("num : " + num++); // "num : 11"
		System.out.println(num); // 12
	}
	
	// �� ��° �޼ҵ�
	public void method2() {
		int a = 10;
		int b = a++;
		
		// 1�� 35��
		// 1. a��� �ĺ��ڸ� ���� int�� ���������� �Ҵ�ް�
		// 2. ������ ���ͷ� �� 10��
		// 3. �����ع���
		
		// 2�� 36���� ���� :
		// b��� �ĺ��ڸ� ���� int�� ���������� �Ҵ����

		// 3�� 36���� ����_1:
		// a��� ���� ������ ���Ե� ������ ���ͷ� ���� ������
		
		// 4�� 36���� ����_2 :
		// a��� ������ ���� 1����
		
		// 5�� 36���� ��� :
		// ������ ���ͷ� ���� b������ �ʱ�ȭ
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 10
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); // 19
		System.out.println("d : " + d); // 20
		
		int num = 20;
		int result = num++ * 3;
		
	}
		// ��������
		public void method3() {
			
			int a = 10;
			int b = ++a;
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			
			int num = 20;
			int result = ++num * 3;
			
			
		
	}
	
}

