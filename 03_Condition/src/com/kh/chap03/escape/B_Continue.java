package com.kh.chap03.escape;

import java.util.Scanner;

public class B_Continue {
	/*
	 * continue : �ݺ����ȿ��� ����ϴ� ����
	 * 
	 * continue���� ������ continue���Ŀ� � �ڵ尡 �����ϴ� �������� �ʰ� pass
	 * �ݺ��� scope �ֻ������ �ö󰡴� ���� �ǹ�
	 */
	
	public void method1() {
		
		// 1���� 10���� �ݺ��� �ϸ鼭 �������� ����ϴµ�
		// Ȧ �� �϶��� ���
		for(int i =1; i <= 10; i++) {
			//if(i % 2 == 1)
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ȸ������ �����Դϴ�.");
		
		while(true) {
			System.out.print("���̵� �Է����ּ���(10�� ����) > ");
			String userId = sc.nextLine();
			
			if(userId.length() > 10) {
				System.out.println("���̵�� 10�� ���ϸ� ��� �����մϴ�.");
				continue;
			} else {
				System.out.println("��� ������ ���̵� �Դϴ�.");
				break;
			}
			
		}
		System.out.println("��¼����¼��~~~");
	}
	
		
}