package com.kh.run;

import com.kh.variable.Casting;
import com.kh.variable.B_KeyboardInput;
//import com.kh.variable.A_Variable;

public class Run {
	
	public static void main(String[] args) {
		
		// �ܺ� Ŭ������ �����ϴ� �޼ҵ� ȣ���ϰ� �ʹ�.
		
		// Ŭ�����̸� Ŭ������Ī = new Ŭ�����̸�();
		//com.kh.variable.A_Variable a = new com.kh.variable.A_Variable();
		//A_Variable a = new A_Variable();
		//a.declareVariable();

		//a.findSeasonMenu();
		//a.declareVariable();
		
		//com.kh.variable.B_KeyboardInput b = new com.kh.variable.B_KeyboardInput();
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest();
		Casting c = new Casting();
		//c.autoCasting();
		c.forceCasting();
	
		
	}

}
