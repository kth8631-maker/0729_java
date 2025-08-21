package com.kh.model.vo;

public class Restaurant {
	
	// 상호, 주소, 메인메뉴
	private String storeName;
	private String address;
	private String mainMenu;
	
	// 기본생성자
	// 모든 필드를 매개변수로 갖는 생성자
	// getter
	// setter
	// information
	// 을 구현해주세요 시~작~
	
	public Restaurant() {}
	
	public Restaurant(String storeName, String address, String mainMenu) {
		this.storeName = storeName;
		this.address = address;
		this.mainMenu = mainMenu;
	}

	public String getStoreName() {
		return storeName;
	}

	public String getAddress() {
		return address;
	}
	public String getMainMenu() {
		return mainMenu;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMainMenu(String mainMenu) {
		this.mainMenu = mainMenu;
	}
	
	public String information() {
		String information = "가게이름 : " + storeName
						   + ", 가게주소 : " + address
						   + ", 메인메뉴 : " + mainMenu;
		return information;
	}
	
}
