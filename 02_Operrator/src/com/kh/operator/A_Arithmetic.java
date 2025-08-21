package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	// ��������� -> ���׿�����, �켱������ ��������å�̶� �Ȱ���
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ��ⷯ(Modular) => ������������ �������� ����
	
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// test();		
		
		System.out.println("num1 + num2 : " + (num1 + num2));
						// 1�ܰ� "num1 + num2 : 10"
						// 2�ܰ� "num1 + num2 : 103"
		// ������� "num1 + num2 : 103
		// ���� �켱������ �����ϰ� �ʹٸ� ()�� �̿��ؼ� �����־�� �ǵ��� ����� ����� �� ����
		
		int sum = num1 + num2;
		System.out.println("�� ���� �հ� : " + sum);
		System.out.printf("\nnum1 + num2 : %d", num1 + num2); 
		System.out.printf("num1 + num2 : %d\n", num1 + num2); 
		
		System.out.println("num1 - num2 : " + (num1 - num2));
						  // 1�ܰ� : "num1 - num2 : 10"
		// ������ ��� ��ȣ�� �������� ������
		// ���ڿ��� num1�� �ϳ��� ��ģ �� ������ ���� ������ ������ �Ұ�����!
		
		System.out.println("num1 X num2 : " + num1 * num2);
		
		// *,/,% �� ģ������ �켱������ +, -���� ���� ������ �������� �ʴ���
		// ���� ������ �����ؼ� ����� ���� �� ����
		// ������ ����� ���� ��ȣ�� ����ϴ� ���� ����
		System.out.println("num1 �� num2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// ���������ؾ��� �κ�
		
		// System.out.println(10 / 0);	
		
	}	
	public void test() {
		System.out.println("�� ���θ޼��忡�� ȣ���ؾ��ϴ� ���� �ƴ�!");
	}
	
	// ���� ���� ���ϱ� ���α׷��� �����Ͻÿ�.
	
	// �޼ҵ� : presentToStudent() <== �޼ҵ� ����
	
	// ����ڿ��� ���� �Է¹�������.         <== Scanner
	// 1. ������ �л��� ��               <== nextInt();
	// 2. ���� ����                    <== nextInt();
	
	// 1�δ� ���� �� �ִ� ������ ���� : ���� ���� / �л��� ��
	// ���� ������ ���� : ��� ���� % �л��� ��             <== ��� ������
	
	// �������
	// �л� �� ��� ���� �� �ִ� ������ ���� : X��           <== ��¹�
	// ���� ���� ���� : X��                            <== ��¹�
	
	public void presentToStudent() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л��� ���� �Է��ϼ��� > ");		
		int students = sc.nextInt();
		System.out.println("�л� �� : " + students + '��');
		
		System.out.println("������ ������ �Է��ϼ��� > ");
		int candies = sc.nextInt();
		System.out.println("���� ���� : " + candies + '��');
		
		int result = candies / students;
		//System.out.println(result);
		int mod = candies % students;
		//System.out.println(mod);
		
		System.out.println("======================");
		System.out.println("�� �� �� �� �� �� �� �� �� ��???");
		System.out.println("���� : " + result + "��");
		System.out.println("�� �� �� �� �� ��???");
		System.out.println("���� : " + mod + "��");
		
		System.out.println("�л� �� ��� ���� �� �ִ� ������ ���� : " + (candies / students));
		System.out.println("���� ���� ���� : " + (candies % students));


		
		
	}
	

	
	
}
