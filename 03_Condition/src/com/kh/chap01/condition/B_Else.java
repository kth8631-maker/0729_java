package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if ~ else
	 * 
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�) {
	 * 		���ǽ��� ����� true���� �� ������ �ڵ�           - a
	 * } else {
	 * 		���ǽ��� ����� false���� �� ������ �ڵ�          - b
	 * }
	 * 
	 * -> ���ǽ��� ����� true�� ��� a�� ����
	 * -> ���ǽ��� ����� false�� ��� b�� ����
	 */

	public void method1() {
	
		// ����ڿ��� ������ �Է¹޾Ƽ� 0���� ū�� �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ּ��� > ");
		int num = sc.nextInt();
		//System.out.println(num);
		
		if (num > 0) {
			System.out.println("�Է°��� 0���� Ů�ϴ�!");						
		} else {
			System.out.println("�Է°��� 0���� ũ�� �ʽ��ϴ�!");
		}
		
		/*
		if(!(num > 0)) {
		
			System.out.println("0���� ũ�� �ʾƿ�~~");
		}
		*/
		// if���� ���ǽ��� ����� true�� ��� => elsse���� �ǳʶ�
		// ���ʿ��� ������ �پ�� => ó���ӵ��� ���
	}	
	/*
	 * if ~ else if��
	 * 
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�1) {
	 * 		���ǽ� 1�� true�� ��� ������ �ڵ�
	 * } else if(���ǽ�2) {
	 * 		���ǽ� 2�� true�� ��� ������ �ڵ�
	 * } else if(���ǽ�3) {
	 * 		���ǽ� 3�� true�� ��� ������ �ڵ�
	 * } else if(���ǽ�4) {
	 * 		���ǽ� 4�� true�� ��� ������ �ڵ�
	 * } else {
	 * 		�տ��� ����ߴ� ��� ���ǵ��� false�� ��� ������ �ڵ�
	 * }
	 */
	public void method2() {
		
		// ������ �Է¹޾Ƽ� 0���� ū�� / 0���� / 0���� ������ ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� �ٶ� > " );
		int num = sc.nextInt();
		//System.out.println(num);
		
		/*
		if(num > 0)
		if(num == 0)
		if(num < 0)
		*/

		/*
		if(num == 0) {
			System.out.println("0�Դϴ�~");
		} else if(num < 0) {
			System.out.println("0���� �۽��ϴ�~");
		} else {
			System.out.println("0���� Ů�ϴ�~");
		}
		*/
		if(num > 0) {
			System.out.println("0���� Ů�ϴ�~");
		} else if(num < 0) {
			System.out.println("0������ �۽��ϴ�");
		} else {
			System.out.println("0�Դϴ�");
		}
	}
	
	public void ageCheck() {
		
		// ����ڿ��� ����(����)�� �Է¹ް�
		// �Է¹��� ���̿� ���� ���� �ٸ� ������ ������ּ���.
		// 1 ~ 12  : ����Դϴ�.
		// 13 ~ 18 : û�ҳ��Դϴ�.
		// 19 ~    : �����Դϴ�.
		// 0       : �Ż����Դϴ�.
		// -       : �¾��Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է����ּ��� > ");
		int age = sc.nextInt();
		
		if((1 <= age) && (age <= 12)) {
			System.out.println("��� �Դϴ�!");
		} else if((13 <= age) && (age <= 17)) {
			System.out.println("û�ҳ� �Դϴ�!");
		} else if(18 <= age) {
			System.out.println("���� �Դϴ�!");
		} else {
			System.out.println("�ùٸ�  ���� �Է����ּ���.");
		}
		
		if(age < 0) {
			System.out.println("�ùٸ� ���̸� �Է����ּ���.");
		} else if(age >= 18) {
			System.out.println("�����Դϴ�.");
		} else if(age <= 12) {
			System.out.println("��� �Դϴ�.");
		} else {
			System.out.println("û�ҳ� �Դϴ�.");
		}
			
		
	}

	
}
