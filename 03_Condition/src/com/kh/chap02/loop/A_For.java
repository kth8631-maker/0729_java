package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method0() {
		/*
		System.out.println("�� ������ �������ƿ�~~");
		System.out.println("�� ������ �������ƿ�~~");
		System.out.println("�� ������ �������ƿ�~~");
		*/
		// �ݺ��ؾ��ϴ� Ƚ���� 328765�� �̶��...?
		
		for(
			int i =0; 
			i < 5;
			i++) {
			System.out.println("��������~~");
			
		}
	}
	
	/*
	 * for��
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * ��ȣ���� �ݺ��� Ƚ���� �����ϴ� �κ�
	 * �ʱ��; ���ǽ�; ������  �� ������ �̷����
	 * ;; �����ݷ����� ������
	 * 
	 * [ ǥ���� ]
	 * 
	 * for(�ʱ��; ���ǽ�; ������) {
	 * 		�ݺ������� �����ϰ��� �ϴ� �ڵ�;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ������ �� "�ʱ⿡ �� �ѹ��� ����"�� ����
	 * 			�ݺ��� �� �� �ʿ��� ������ �����ϰ� �ʱ�ȭ �ϴ� ����(���� ����) => int i =0;
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� ����� true�� ��� �ݺ��� ����
	 * 			���ǽ��� ����� false�� ��� �ݺ����� ���߰� for�� ���� �������� => i < 5;
	 * - ������ : "�ݺ����� �����ϴ� ������ ���Ե� ��"�� �����ϴ� ����
	 * 			���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
	 * 			�� ��, ���������� ���������ڸ� �����								=> i++
	 */
	
	public void method1() {
		// ����~~~¥ �ܼ��ϰ�
		// 1
		// 2
		// 3
		// 4
		// 5
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/		
		//System.out.println("1\n2\n3\n4\n5");
		/*
		for(int i = 1; i <= 3285; i++) {
			System.out.println(i);
		}
		*/
		
		for(/* 1 */ int i = 1; /* 2 */ i <= 5; /* 4 */ i++) {
			// ������ ���� i�� ���� -> �������� / ������ ���ͷ� 1 / 1�� i��� ���� ������ �ö󰣴�
			/* 3 */ System.out.println(i+ "�� �ݺ�");
		}
		
		// �� �׷��� ¥��¥���̵�
		// for���� �̿��ؼ� �ݺ��� 3�� �Ѵٰ� ����
		// i, j, k
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("------------------------------------");
		
		for(int i = 100; i >=1; i--) {
			System.out.println(i);
		}
		
		
	}

	public void gugudan() {
		
		// ������ ���α׷�
		//
		// ����ڿ��� ������ �Է¹޾Ƽ�
		// ����ڰ� �Է��� ������ �̿��ؼ� �������� ����غ���
		// System.out.println("����");
		
		// �� �������� ���� ��
		// �� ���� ����Ͻðڽ��ϱ� > 8
		
		// 8 X 1 = 8
		// 8 X 2 = 16
		// 8 X 3 = 24
		// ...
		// 8 X 9 = 72
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ ���α׷� �� ");
		System.out.println("�� ���� ����Ͻðڽ��ϱ� > ");		
		int num = sc.nextInt();
		System.out.println(num + "���� ����ϰڽ��ϴ�.");
		// 5��� �Է��ߴٰ� ����
		/*
		System.out.println(num + "X 1 = " + (num * 1));
		System.out.println(num + "X 2 = " + (num * 2));
		System.out.println(num + "X 3 = " + (num * 3));
		System.out.println(num + "X 4 = " + (num * 4));
		System.out.println(num + "X 5 = " + (num * 5));
		System.out.println(num + "X 6 = " + (num * 6));
		System.out.println(num + "X 7 = " + (num * 7));
		System.out.println(num + "X 8 = " + (num * 8));
		System.out.println(num + "X 9 = " + (num * 9));
		*/
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "X" + i + " = " + (num * i));
		
		}
		
		
	}
	
	public void method2() {
		
		// �ڡڡ�
		// �ڡڡ�
		// �ڡڡ�
		
		// System.out.println("�ڡڡ�");
		// System.out.println("�ڡڡ�");
		// System.out.println("�ڡڡ�");
		
		/*
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println();
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		System.out.println();
		System.out.print("��");
		System.out.print("��");
		System.out.print("��");
		*/
		/*
		for(int i = 0; i < 3; i++) {
			System.out.print("��");
		} System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.print("��");
		} System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.print("��");
		}
		*/
		
		for(int i = 0; i < 3; i++) {			
			for(int j = 0; j < 3; j++) {				
				System.out.print("��");
			}			
			System.out.println();			
		}
		
		// ��� : X��° �ݺ��Դϴ�.
		//		10��° �ݺ����� ���� �ϳ��� ����ֱ�
		for(int i = 0; i < 100; i++) {
			
			System.out.println((i + 1) + "��° �ݺ��Դϴ�.");
			
			// (i + 1) == 10 || (i + 1) == 20 || (i + 1) == 30
			// (i + 1) % 10 == 0
			
			if((i + 1) % 10 == 0) {
				System.out.println("��");
			}
			
		}
	}
	
	public void method3() {
		
		for(;;) {
		
		System.out.println("������ ���α׷� ~~~");
		System.out.println("1. ������ ���α׷� �����ϱ�");
		System.out.println("2. ������ ���α׷� ������");
		System.out.println("3. ���α׷� �����ϱ�");	
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �������ּ��� > ");
		int menuNo = sc.nextInt();
		sc.nextLine();

		if(menuNo == 1) {
			gugudan();
		} else if(menuNo == 2) {
			System.out.println("�������� ���۽������");
			System.out.println("�� ����־��");			
		} else if(menuNo == 3) {
			System.out.println("���α׷��� �����մϴ�.");
			return;
		} else {
			System.out.println("�̷� �޴��� ����� ~ ");
		}
		
		
		
		
	}
	
	
	
	
	
	}
	
}
	
	

