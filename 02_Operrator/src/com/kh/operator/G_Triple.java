package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * ���� ������ : �� �����ڰ� 3�� => �� 3���� 1���� �����ڷ� �̷����(���ǹ��� �������� ����)
	 * 
	 * ���ǹ� : ���� ���� ������ ó���ϴ� ���
	 * 		  ������� true�� ��� ù ��° ������ ó��~~~
	 * 		  ������� false�� ��� �� ��° ������ ó��~~~
	 * 
	 * [ ǥ���� ]
	 * ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� ����� 
	 */
	
	// ������������
	public void method1() {
		System.out.println("���� �޴��� : ");
		System.out.println("1. �ĳ��� �ƴٿ�� ���̻� ���� ASD ���߷�");
		System.out.println("2. �ݷҺ�� �� �Ķ��̼� ���̻� ���߷�");
		System.out.println("3. �µζ� ���Ϲ� ���� �� ��� ���̻� ���õ� ");		
		// Ctrl + Shift + o(import �ڵ��ϼ� ����Ű)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�޴� ��ȣ�� �Է����ּ��� > ");
		int menuNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1)	? "�ĳ��� �ƴٿ�� ���̻� ���� ASD ���߷��� �ֹ��ϼ̽��ϴ�."
							: (menuNo == 2) ? "�ݷҺ�� �� �Ķ��̼� ���̻� ���߷��� �ֹ��ϼ̽��ϴ�."
							: (menuNo == 3) ? "�µζ� ���Ϲ� ���� �� ��� ���̻� ���õ带 �ֹ��ϼ̽��ϴ�."
							: "���� �޴��� �ֹ��ϼ̽��ϴ�.";
							
		// ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� ��� ��
		
		// ������ ��ȣ�� ���� �޴����� ���
		// 1�� �Է� �� == "�� ��� ���� ��� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�."
		
		System.out.println(selectedMenu);		
		
	}

	// Ȧ¦ ���ϱ�
	public void method2() {
		
		// ����ڿ��� ���� ���� �ϳ� �Է¹޾Ƽ�
		// �Է¹��� ������ Ȧ / ¦ �Ǻ��ؼ� ���
		
		// �Էµ��� ��Ī ����
		Scanner sc = new Scanner(System.in);
		
		//�ʿ��� ���� �Է� ���� �� �ֵ��� �޽��� ���
		System.out.println("���ڸ� �Է����ּ��� > ");
		
		// ������ ������ ������ �� ��ĳ���� �޼ҵ带 ȣ���ؼ� �Է� ���ۿ� �ִ� �������� �޾ƿͼ�
		// ������ ���� ������ �ʱ�ȭ
		int num = sc.nextInt();
		//System.out.println("���ϰ� ��¹� : ������ ���� > " + num);
		
		// num % 2 != 0
		// num % 2 == 1
		// num % 2 == 0 ==> ����(�Ǻ�)�� ����ϱ�� ����
		// �� �̷��� ����� ������?
		
		char oddEven = ((num % 2 == 0)) ? '¦' : 'Ȧ';
		
		System.out.println("�Է��Ͻ� " + num + "��(��) " + oddEven + "�� �Դϴ�.");
		
		
	}
	
	public void practice() {
		
		// ����ڿ��� ���ĺ� �� ���ڸ� �Է¹޾Ƽ�
		// �Է¹��� ���ĺ��� �ҹ������� / �빮������ �Ǻ� �� ������ּ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ� �� ���ڸ� �Է��ϼ��� > ");
		char alphabet = sc.nextLine().charAt(0);
		//System.out.println(alphabet);
		
		//char letter = (65 <= alphabet) && (alphabet <= 90) ? '��' : '��';
		char result = (alphabet < 97) ? '��' : '��';
		char result2 = (('a' <= alphabet) && (alphabet <= 'z')) ? '��' : '��';
		
		System.out.println("����ڰ� �Է��� ���ĺ� " + alphabet + "��(��) " + result + "�����Դϴ�.");
		System.out.println("����ڰ� �Է��� ���ĺ� " + alphabet + "��(��) " + result2 + "�����Դϴ�.");
		

		
		// �������
		// XXX(����ڰ� �Է��� ���ĺ�)��(��) �ҹ��� / �빮�� �Դϴ�.
		
	}
	
}
