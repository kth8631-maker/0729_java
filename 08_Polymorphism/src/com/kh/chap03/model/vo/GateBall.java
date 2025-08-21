package com.kh.chap03.model.vo;

public class GateBall extends Sports {
	
	@Override
	public void rule() {
		System.out.println("손이나 발로 공을 치면 안됨");
	}
	
	/*
	 * 첫 번째 방법
	@Override
	public void rule() {
		
	}
	*/

}
