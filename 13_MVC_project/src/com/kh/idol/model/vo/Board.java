package com.kh.idol.model.vo;

public class Board {
	
	private int boardNo;
	private String boardTitle;
	private String boareContent;
	private String userId;
	private String createDate;
	
	public Board() {
		super();
	}

	public Board(int boardNo, String boardTitle, String boareContent, String userId, String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boareContent = boareContent;
		this.userId = userId;
		this.createDate = createDate;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoareContent() {
		return boareContent;
	}

	public void setBoareContent(String boareContent) {
		this.boareContent = boareContent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boareContent=" + boareContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}
	
	
	
	
	/*
	 * 제목
	 * 내용
	 * 작성자
	 * 작성일
	 */
	

}
