package com.kh.operator;

public class E_Comparison {
	
	/*
	 * �� ������(���� ������)
	 * 
	 * �� ���� ���� ������ ��, ���� ������
	 * �񱳿����� �� ��� -> ���� ��� true, ������ ��� false
	 * Ư�� ������ ������ �� �ִ� ���ǹ����� ���ǽ����� ����� ����~~
	 * ������ ��Ʈ���� ���� �߿��� ��
	 */
	/*
	 * ����
	 * 
	 * 1. ����� : ��ġ���� ��
	 * a == b : a�� b�� ��ġ�մϱ�?
	 * a != b : a�� b�� ��ġ���� �ʽ��ϱ�?
	 * 
	 * 2. ��Һ� : ũ�� ������ ��
	 * 
	 * a < b : a�� b���� �۽��ϱ�?
	 * a > b : a�� b���� Ů�ϱ�?
	 * a <= b : a�� b���� �۰ų� �����ϱ�?
	 * a >= b : a�� b���� ũ�ų� �����ϱ�?
	 * 
	 * ������� true / false
	 */
	
	public void method1() {
		
		//System.out.println("ȣȣȣ");
		
		int firstNumber = 10;
		int secondNumber = 25;
		
		System.out.println("firstNumber < secondNumber : " + (firstNumber < secondNumber));
		
		System.out.println("�� ���� ������ : " + (firstNumber == secondNumber));
		
													// ���� ���� �ʿ�����?
													// firstNumber
													// ���� ������ �ؾ�����?
													// �񱳿���
													// 2�� ������ �� �������� 0��?
		System.out.println("firstNumber�� ¦ �� �Դϱ�? : " + (firstNumber % 2 == 0));
		
		
		System.out.println("secondNumber�� Ȧ ���� �ƴմϱ�?" + (secondNumber % 2 != 1));
		
		
		
	}

	
	
}
