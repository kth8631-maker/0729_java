package com.kh.chap02.loop;

public class B_While {

	/*
	 * while��
	 * 
	 * [ ǥ���� ]
	 * 
	 * �ʱ��;			// �ʼ��� �ƴ�
	 * 
	 * while(���ǽ�) {
	 * 
	 * 		�ݺ������� �����ϰ��� �ϴ� �ڵ�;
	 * 		������;		// �ʼ��� �ƴ�
	 * 
	 * }
	 * 
	 * while���� ���ǽ��� ������� true�� ��� �ݺ������� �����ϰ����ϴ� �ڵ尡 ����
	 * 
	 * 
	 * for			=> �����ڰ� �ݺ��� Ƚ���� ��Ȯ�ϰ� �˰� �ִ�.
	 * while		=> �����ڰ� �ݺ��� Ƚ���� ������ �� ����.
	 * 
	 * ���ѹݺ�
	 * 
	 */
	
	/*
	public void method1() {
		while(true) { // ���ѹݺ��� �뵵
			System.out.println("��� �ݺ��Ұſ���~");
		}
	}
	*/
	
	public void method2() {
		
		//�ʱ��, ���ǽ�, ������
		
		int i = 0;
		
		while(i < 3) {
			System.out.println(i);
			i++; 
		}
		
		
	}
	
	public void method3() {
		
		// 1~10������ ���� �� ¦���� �� ���
		// 55
		// 2550		
		// System.out.println(2 + 4 + 6 + 8 + 10);
		
		// 1�ܰ� 1���� 10������ �հ� �� ���
		
		int i = 1;
		int sum = 0; // �հ踦 �����ص� ����		
		while(i <= 10) {			
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	public void method4() {
		
		// 1���� �����ؼ�
		// 1 ~ 10 ������ ������ ���������� ��� ���� �հ踦 ���
		// random : ������
		// Random�̶�� Ŭ������ ����
		// Math��� Ŭ������ ������ �ִ� random()�� ȣ���ؼ� ����� �� ����
		
		// Math math = new Math();
		//Math.random();
		
		// System.out.println(Math.random());
		// 0.5834150975171736
		// 0.8953362712770363
		
		// random()�� ����� : 0.0 ~~~~ 0.9999999999999999
		
		// 1�ܰ�. random() ȣ�� ��� üũ
		double num = Math.random();
		// System.out.println((int)num);
		// 1 ~ 10
		
		// 2_1. num�� 10�� ���ϸ�??
		// 		0.0 ~~~~ 9.999999999999999
		// System.out.println(num * 10);
		// 2_2. int������ ��������ȯ
		// 		0 ~~~~ 9
		// System.out.println((int)(num * 10));
		// 2_3. + 1
		//		1 ~~~~ 10
		
		int randomNum = (int)(Math.random() * 10) + 1;
		System.out.println("������ ���� ������ ���� : " + randomNum);
		// (int)(Math.random() * ��� ������) + ���۰�;
		
		
		// 3�ܰ�. �����հ� ���ϱ�
		// 1���� ������ �� (1~10)������ ��� ���� �հ�
		
		int i = 1;
		int sum = 0;
		
		// 1���� 10���� �� ���������� �ݺ��ϰڴ�.
		while(i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + randomNum + "���� ���� ��� : " + sum);
		}
	
	public void lotto() {
		
		// �ζ� ��ȣ ������ ver_0.1
		// ���� : 1 ~ 45
		// 6�� ����
		// 1~45 ���� �� ������ �� �ϳ��� �̾Ƴ�����?
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println("�̹��ִ� �̰ɷ� ��߰ڴ� > ");
		System.out.printf("%d, %d, %d, %d, %d, %d", num1, num2, num3, num4, num5, num6);				
	}
	
	/*
	 * do-while
	 * 
	 * ������ ���ǰ˻� ���� ������ �� ���� ����!!!!!!!!!!!!!!!!!
	 * ������ true���� �ƴϴ��� �� ���� �� ����!!!!!!!!!!!!!!
	 * 
	 * [ ǥ���� ]
	 * 
	 * �ʱ��; // �ʼ� X
	 * 
	 * do {
	 * 		�������ڵ�;
	 * 		������; // �ʼ� X
	 * } while(���ǽ�);
	 * 
	 */
	
	public void method5() {
		/*
		while(false) {
			System.out.println("�յ� �̰�");
		}
		*/
		
		do {
			System.out.println("���� �� ���� ����~~");
		} while(false);
	
		
	}
	
	
	
	
	}
	
	
