package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	/*
	 * �� ������ : �� ���� ������ �����ϴ� ������
	 * 
	 * [ ǥ���� ]
	 * 
	 * ���� �������� ���� => ������� ����
	 * 
	 * ����
	 * 
	 * 1. AND������ : ���� && ����
	 * ���װ� ������ ���� ��� true���߸� ���� ������� true
	 * 
	 * 2. OR������ : ���� || ����
	 * ���װ� ������ �� �� �ϳ��� true�� ��� ���� ������� true 
	 */
	// AND
	public void method1() {
		
		// ��ȹ
		//
		// 1. ����ڿ��� �������� �ϳ� �Է¹��� ��
		// 2. ����ڰ� �Է��� ���� ���� 0���� ũ�鼭 ¦������ �Ǻ�
		// 3. �׸��� ���� ����� ���
		//
		
		// 0.
		Scanner sc = new Scanner(System.in);
		
		// 1.
		System.out.println("���� ���� �Է����ּ��� > ");
		int num = sc.nextInt();
		//System.out.println(num); // ����ù��� �ؾ��� �� ���� ����
		
		// 2.
		// ���� ��? == num
		// ���� ����???
		// 1. 0���� ū��?(��Һ�) // num > 0
		// 2. 2�� ���� �������� 0�� ��ġ�ϴ°�?(�����) // (num % 2) == 0
		
		// AND ������
		// &&�� �ǹ� : �׸���, ~~�̸鼭, ~~�̰�
		
		boolean result = (num > 0) && (num % 2 == 0);
			// ����ڰ� �Է��� ������ 0���� ũ�� �׸��� ����ڰ� �Է��� ������ 2�� ������ �� �������� 0�ΰ���?
		
		System.out.println("�Է� ���� 0���� ũ�鼭 ¦���Դϱ�? : " + result);
		
	}
	
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			// ����ڿ��� ���� ���� �Է¹޾Ƽ�
			System.out.println("1���� 100������ ���ڸ� �Է����ּ��� > ");			
			// ������ ������ ��
			int number = sc.nextInt();
			// ����غ�����.
			//System.out.println("�Է¹��� �� : " number);
			
			// ����ڰ� �Է��� ������ 1 ~ 100 ������ ������ Ȯ���ϱ�
			// 1. ����ڰ� �Է��� ���� == number
			// 2. 1
			// 3. 100
			
			// 1 <= ����ڰ� �Է��� �� <= 100
			// 1 <= number <= 100
			//System.out.println(1 <= number <= 100);
			
			// 2_1. (0 < number) && (number < 101)
			// 2_2. (100 >= number) && (1 <= number)
			// 2_3. (1 <= number) && (number <= 100)
			// 2_4. (number >= 1) && (100 >= number)
			
			
			
			// ����ڰ� �Է��� ���� 1 ~ 100 ������ �������� �Ǻ��Ͽ� ������� ��
			boolean result = (1 <= number) && (number <= 100);
			System.out.println("�Է°��� 1���� 100������ ���Դϱ�? : " + result);
			
			
		}

		// OR
		public void method3() {
			
			// ����ڿ��� �� ���ڸ� �Է� �޾Ƽ�
			// �Է¹��� ���� 'A' �Ǵ� 'a'���� Ȯ���ؼ� ����ϱ�

			Scanner sc = new Scanner(System.in);
			
			System.out.print("�� ���ڸ� �Է����ּ��� > ");
			char letter = sc.nextLine().charAt(0);
			//System.out.println(letter);
			/*
			String str = "KH����������";
			char ch = str.charAt(2);
			System.out.println(ch);
			index : 0���� ����
			*/
			// ���� ��?
			// 1_1. ����ڰ� �Է��� �� ���� == letter
			// 1_2. 'A'
			// 1_3. 'a'
			
			// ���� ����?
			// == ����� ����
			// ���� ������ ��� ����� ������ �����Ѱ�?
			// �����ϴ�! ==> ��???
			// char���� int������ �ڵ�����ȯ�� �Ͼ �� ������ ��
			
			boolean result = (letter == 'a') || (letter == 'A');
			// || : ~~~~�̰ų�, �Ǵ�
			
			System.out.println("����ڰ� �Է��� ���� 'A'�Ǵ� 'a'�ΰ���? > " + result);
			
			
		}
		
		/*
		 * AND(&&) : �� ���� ������ ��� true�� ��� true
		 * 
		 *  true && true   : true
		 *  true && false  : false
		 *  false && true  : false
		 *  false && fasle : false
		 *  
		 *  OR(||) : �� ���� ���� �� �ϳ��� true�� ��� true
		 *  true || true   : true
		 *  true || false  : true
		 *  false || true  : true
		 *  false || fasle : false
		 */
		
		public void tip() {
			
			int num = 10;
			
			boolean result = false && (num > 0);
			
			boolean result2 = (num < 0) && (num == 10);
			
			// ��-��Ŷ ����
			
			
		}
		
		
		
	}
	
	

