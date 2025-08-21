package com.kh.chap07.remote.model.vo;

// 필요한 값들을 저장하는 역할
public class Television {

	private boolean On;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "대한민국 24시 뉴스 채널";
		channel[1] = "Ground C";
		channel[2] = "KRM News";
		channel[3] = "Fox News";
		channel[4] = "뽀로로 TV";
	}
	
	public String[] getChannel() {
		return channel;
	}
	public boolean isOn() {
		return On;
	}
	public void setOn(boolean on) {
		this.On = on;
	}
	
}
