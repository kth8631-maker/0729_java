package com.kh.chap03.model.vo;

public class PracticeVO {

	// 필드부
	private String origin;
	private String varieties;
	private String processing;
	private int gram;
	private int price;
	
	// 메소드부 getter / setter / info
	// 필드값을 반환해주는 메소드 == getter
	public String getOrigin() {
		return origin;
	}
	
	public String getVarieties() {
		return varieties;
	}
	
	public String getProcessing() {
		return processing;
	}
	
	public int getGram() {
		return gram;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 필드값을 셋팅 해주는 메소드 == setter
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public void setVarieties() {
		this.varieties = varieties;
	}
	
	public void setProcessing() {
		this.processing = processing;
	}
	
	public void setGram() {
		this.gram = gram;
	}
	
	public void setPrice() {
		this.price = price;
	}
	
	// info()
	public String info() {
		String info = "산지 : " + origin
					+ "품종 : " + varieties
					+ "가공 : " + processing
					+ "무게 : " + gram
					+ "가격 : " + price;
		return info;
	}

	
	// 커피를 마시면 남은 원두량을 알려주는 메소드
	public void drink() {

		if(gram> 0) {
		System.out.println(gram + "g 남았습니다.");
		gram -= 20;
		} else {
		System.out.println(origin + " 원두가 모두 소진되었습니다.");

			}

		}
}
