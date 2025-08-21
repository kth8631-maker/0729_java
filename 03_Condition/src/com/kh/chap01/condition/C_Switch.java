package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ������?(B1 / B2 / B3) > ");
		String floor = sc.nextLine();
		//System.out.println(floor);
		
		// B1 B2 B3
		switch(floor) {
		case "B1" : System.out.println("���� 1���Դϴ�. ���� �����ϴ�."); break;
		case "B2" : System.out.println("���� 2���Դϴ�. ���� �����ϴ�."); break;
		case "B3" : System.out.println("���� 3���Դϴ�. ���� �����ϴ�."); 
		}
		
	}
	
	/* 
	 * switch ��
	 * 
	 * [ ǥ���� ]
	 * 
	 * switch(case���� ����� ����� ���) {
	 * case ����, ����, �Ǽ�, ���ڿ� : ������ �ڵ�;
	 * }
	 * 
	 * swith(���� || �Ǽ� || ���� || ���ڿ�) {
	 * case ��1 : �������ڵ�a; // ����񱳴�� == ��1 true�� ��� �������ڵ� a�� ����
	 * break;			   // switch������ ��������
	 * case ��2 : �������ڵ�b; // ����񱳴�� == ��2 true�� ��� �������ڵ� b�� ����
	 * break;
	 * case ��n : �������ڵ�n; // ����񱳴�� == ��n true�� ��� �������ڵ� n�� ����
	 * break;
	 * default : �������ڵ�; // == else
	 * }
	 * 
	 * 
	 * 
	 */
	
	// �޴� �ֹ�
	// �δ��, ������, ��������, Į����, ������
	public void method1() {
		
		// ����ڿ��� ������ ������ �̸��� �Է¹޾�
		// �� ���ĸ��� ������ ������� ��
		
		// �δ��,   ������, ��������, Į����, ������
		// 11000,  13000,   7000, 8000, 7000
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �������ּ���(����, ������, ����, Į����, ������) > ");
		String menu = sc.nextLine();
		// System.out.print(menu);
		
		/*
		if(menu.equals("����")) {
			System.out.println("11000�� �Դϴ�.");
		} else if(menu.equals("������")) {
			System.out.println("13000�� �Դϴ�.");
		} else if menu...
		*/
		
		/*
		switch(menu) {
		case "����" : System.out.println("11000�� �Դϴ�."); break;
		case "������" : System.out.println("13000�� �Դϴ�."); break;
		case "Į����" : System.out.println("8000�� �Դϴ�."); break;
		case "����", "������" : System.out.println("7000�� �Դϴ�."); break;
		default : System.out.println("�׷� �޴� ����� ~ ");
		}
		*/
		// �ߺ������ϱ�
		// 1. �ߺ��� �κ��� �ϳ��� ����
		// 2. �ߺ��� �ƴ� �κ��� ������ ó��
		

		int result = switch(menu) {
		case "����", "������", "Į����" -> 3000;
		case "������", "����" -> 5000;
		default -> 0;
		};
		System.out.println(result);
		
		int price = 0;
		switch(menu) {
		case "����" : price = 11000; break;
		case "����" : price = 7000; break;
		case "������" : price = 13000;break;
		case "Į����" : price = 8000; break;
		case "������" : price = 7000; break;
		default : System.out.println("�׷� �޴��� ����� ~ ");
		return; // ���� ����ǰ� �ִ� �޼ҵ� ������ �ƿ� ����������.
				// �޼ҵ带 ȣ���� ������ ���ư�
		} // break�� ������ ���������� �κ�		
		
		//if(price != 0) {
		System.out.println(price + "�� �Դϴ�.");
		//}	
		
		
	} // return�� ������ ���������� �κ�


	
	
	

	// ���ǹ� ��!
	public void login() {
		
		// �α��� �����ϱ�!
		// ��ȹ / ����
		
		// ��ȹ -> �� ������?
		// ���� -> ��� ������?
		
		// �α��� ��� -> �м� -> ����
		// �α����̶� ����...?
		
		// ���̵� ��й�ȣ
		//    �Է�
		
		// �α��� ������ �� �ʿ��� �� :
		// 1. ����ڰ� �Է��� ���̵� ��  -> ���ڿ�
		// 2. ����ڰ� �Է��� ��й�ȣ �� -> ���ڿ�
		
		// �α��� �� �ʿ��� ���� �۾�
		//ȸ������
		
		// 1. ȸ������ �� ����ڰ� ���ϴ� ���̵� ���� ��й�ȣ ���� �Է��Ͽ� ȸ�������� ������
		// 2. ���� �� �Է��ߴ� ���̵�� ��й�ȣ�� �� �� ��Ȯ�� �Է��Ѵٸ� �α��� ���� ȭ�� ���
		// 3. ���� �� �Է��ߴ� ���̵� �Ǵ� ��й�ȣ�� �ϳ��� ��ġ���� �ʴٸ� �α��� ���� ȭ�� ���
		
		// �ϴ��� ������ ȸ�������� �����ߴٰ� ����
		String id = "user01";
		String password = "pass01";
		String name = "ȫ�浿";
		
		// ---------------------------------------------------------------------
		
		System.out.println("KH����");
		System.out.println("======================");
		System.out.println("�α��� ���� �Դϴ�.");
		System.out.println("======================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println("���̵� > ");
		String userId = sc.nextLine();		
		
		System.out.println("-----------------------");
		System.out.println("��й�ȣ > ");
		String userPwd = sc.nextLine();
		
		System.out.println("-----------------------");
		
		// ���࿡ ����ڰ� �α��� �� �Է��� ���̵� ���� ȸ������ �� ������ ���̵� ���� �����ϰ�
		// ����ڰ� �α��� �� �Է��� ��й�ȣ ���� ȸ������ �� ������ ��й�ȣ ���� �����ϴٸ�
		if(userId.equals(id) && userPwd.equals(password)) {
			System.out.println("�α��� ���� ~" + name + "�� ȯ���մϴ� !");
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		// �⺻�ڷ��� : boolean, char, byte, short, int, long, float, double
		// => �⺻�ڷ����� ��� ����� �����ڸ� �����ϴµ� �־� ������ ����(==, !=)
		
		//�����ڷ��� : �� ��
		// => ����� ������(==,!=)�� ���ؼ� ���� ���ϴ°��� �Ұ���!!
		// ���� ������ ���� ���� '�ּҰ�'�̱� ����
		// ���ڿ��� ���� �� : equals() => true / false
		
		
	}
	
	
}


