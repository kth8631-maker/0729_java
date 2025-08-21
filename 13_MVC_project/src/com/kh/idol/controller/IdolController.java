package com.kh.idol.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;
import com.kh.idol.model.vo.Idol;

public class IdolController {
	
	private List<Fan> fans = new ArrayList();
	private List<Board> boards = new ArrayList();
	private List<Idol> aespa = new ArrayList();
	
	{
		aespa.add(new Idol("카리나", "리더", "Rocket Puncher"));
		aespa.get(0).setImage("""
⡱⡈⡢⢑⢐⠡⢂⠊⢔⠐⢔⠐⢔⠐⠔⡐⠔⡐⠔⡐⡐⠔⡐⣐⡰⡔⣔⢴⣔⢕⢕⢅⢇⢣⢃⢢⢐⢆⢢⠱⡡⠣⡑⠔⢐⠠⢀⢔⠵⣕
⢔⢂⠪⢐⢐⠅⠅⡊⠄⠕⡐⠡⢂⠅⡑⢄⠑⢄⢑⢐⠨⢐⢔⣷⣻⣞⡾⣝⣮⢫⢿⣽⢮⡪⡪⡪⢪⢢⠣⡃⡇⠕⢌⠌⢔⢔⢵⢹⢍⠎
⡢⢂⢅⢑⠐⠌⢌⢐⠡⢑⠨⠨⡐⠨⠐⢄⢑⢐⢐⢐⢨⡾⣝⣮⡷⡗⠯⢻⢺⣟⣯⣿⣻⣯⡆⢇⢣⠱⡑⢕⢘⢌⢖⢝⢼⡱⡝⠜⡀⠂
⢌⢂⢂⠢⠡⡡⠡⢂⠅⣂⢊⠔⠨⠨⠨⡐⡐⡐⡐⣐⣿⣽⡯⡇⠕⡈⠌⢐⠐⡸⢽⢾⣻⣾⣿⠜⡌⡪⡘⣌⢎⡮⡺⡭⡣⠇⡑⡀⡂⠅
⢐⠔⡐⠡⠡⡂⡵⡵⣝⣞⡮⣎⢎⠌⡂⡂⡂⡂⡂⣾⣳⣿⣇⢃⠅⡐⠨⢀⢂⢂⠌⢟⣿⣿⣻⡇⢎⠢⢁⣪⢳⢝⡝⡎⠅⠅⡂⡐⠠⠨
⡐⡐⠌⢌⢢⢯⢯⣞⣗⣗⡯⡯⣗⢅⠂⠔⢐⠠⢒⣿⣻⣿⣍⢇⡇⡢⠡⡑⣕⣥⡩⡐⢹⣟⢻⣿⢰⢱⢕⡵⣫⢺⠨⢂⠅⡑⡐⠨⠈⠌
⢂⠌⠌⢔⢽⢽⢵⣳⡳⣳⢽⣫⣟⢬⠨⢈⢐⠨⣸⣟⣿⣟⠘⠍⠕⠄⠡⡈⡊⠢⡁⡂⢜⢜⢬⣿⣎⢮⡣⣳⠱⠡⡊⠔⡁⡢⠨⢨⠨⠐
⡐⡨⡈⡪⡹⣵⣻⣪⢾⢽⢽⣺⠪⠱⠨⠠⠢⢐⣽⣯⣿⣷⢁⠅⠅⡅⡡⡐⠨⡐⡀⡂⡢⣣⣿⣿⡺⡜⡎⡪⡘⢌⠢⡑⡰⠠⢁⠢⠡⠊
⢐⠠⠂⡂⢪⡳⣵⡫⡯⣫⢯⡪⠈⠌⠄⠅⠌⣸⡷⣿⣿⣿⣧⠪⡨⡬⡢⡬⡢⢂⢂⢢⣿⣾⣿⢿⣣⠫⡂⡪⡐⢅⢊⢐⠄⠕⡐⠨⡊⢌
⡐⠨⢐⢰⡳⡽⣺⡺⡽⣝⣵⣳⠡⠡⠈⠄⠅⣾⣻⡿⣿⣿⣿⣯⡢⡑⠍⢊⠠⢂⠆⢽⣿⣿⣿⣿⢪⠨⡢⢒⠌⡢⢂⠅⢌⠢⡈⡂⡪⡂
⠄⡑⠠⡣⡯⡯⣞⢞⢽⡺⣺⢎⠪⠠⠁⠅⡪⣿⣽⣿⣿⣿⣿⣿⣟⢎⢎⠔⢌⠢⠨⢺⣿⣿⣟⣿⡸⣌⠆⢕⠨⡂⢅⢊⢐⢐⠔⡐⠔⢌
⢐⠨⢐⢸⡪⣎⣢⡑⡔⣝⢜⢅⠕⣨⢬⢔⡽⣷⢿⣾⣿⣿⣿⣿⡳⡩⡊⡊⡢⠡⡃⢝⣿⣿⣿⣿⣪⣳⢡⢡⢑⠌⡂⡢⢂⢅⠪⡐⢕⠡
⠂⢌⠰⣹⣺⢵⡳⡽⣺⢵⢯⡃⣾⣽⡽⣟⣽⣽⢿⣿⣿⣟⡿⡺⡸⡨⢌⠢⢊⠌⡢⣻⣿⢿⣿⣿⣷⢵⢇⢆⢕⢘⠔⡨⡐⢔⢱⢑⢅⠣
⣷⣣⢯⡳⡽⣕⢯⢯⡳⡯⣳⣽⢷⣯⣟⡷⣿⢾⣿⣿⣿⣿⢣⢑⠔⢌⠢⠡⡑⠌⣾⣟⣿⣿⣽⣾⣻⢭⣳⢕⢌⠔⢨⢐⢌⢎⢪⠸⡐⢅
⣿⣪⢷⢽⢕⡯⣫⢗⡽⡽⣵⣟⣿⣾⣷⣿⣿⣿⣿⣿⣿⢏⠢⡑⠌⡂⢅⢑⢐⣝⣷⢿⣽⣯⡿⣾⢽⣟⣷⢯⡾⣇⢢⢱⢸⢨⢢⠣⡑⢔
⣟⣮⣳⢝⣗⡽⣳⣫⢯⣞⣿⣽⣿⣿⢿⣻⣿⣿⣿⢿⡻⡨⢂⠊⢌⢐⢐⢐⣱⣯⢿⣻⡷⣟⣿⣯⣿⣿⣻⣟⣿⣳⢱⢱⢸⠸⡐⠕⢌⢊
⣟⣞⢮⣻⡺⣺⡳⡽⣵⣳⣯⣿⣽⣾⣿⣿⣿⡿⣾⡿⣧⣦⣡⣊⢔⢐⢐⡱⣷⣻⣟⣯⣿⣿⢿⣾⣿⣿⣽⢿⣾⣻⡘⡜⡘⢜⢌⢕⢱⢐
⢞⣮⣳⡳⣝⡷⡽⣽⣺⡾⣯⣿⣿⣿⡿⣿⣻⣽⣿⣻⣿⡽⣯⡿⣟⣿⢷⣻⣽⢷⣻⣽⣿⣻⣿⡿⣿⣷⢿⡿⣷⢿⡪⡢⡪⢢⠪⢯⣟⣷
⣗⠗⡕⣙⢅⢍⢝⢚⡾⣿⣟⣿⣺⣷⣿⣿⣻⣿⣺⣿⢾⣻⣯⣿⣻⣟⣿⡽⣯⣿⢿⣻⣽⡷⣿⣿⣿⣟⣿⣻⣟⣿⢸⢨⢊⠢⠣⡑⢌⠎
⣡⠵⡚⢕⢙⠍⠫⣺⣯⣿⢾⣿⣿⣿⣽⣿⣯⡷⣿⣟⣿⣻⡾⣷⡿⣽⣾⣻⣿⣽⢿⣻⣽⣟⣿⡿⣿⣯⣿⣽⣯⣗⡗⡕⢅⠣⡱⡨⡂⢕
⠨⡂⡊⡐⡐⡨⣘⣾⣟⣿⣿⣿⣿⣿⣿⣿⢷⣿⣻⣿⣯⣿⣟⣿⡯⣿⣾⣿⣻⣾⣟⣿⡽⣟⣿⣿⣻⡿⣿⡾⣗⢇⡣⣊⠢⡑⣜⡗⣬⣿
⣌⢦⢞⡮⡯⣟⣾⣳⡿⣾⢿⣿⣿⣿⣿⣿⢿⣾⣿⣿⣿⣷⣿⣿⣻⣿⣻⣾⣟⣷⣟⣷⢿⣿⣿⣿⣽⣻⡿⣿⢣⢣⢟⣮⢫⡺⣳⣟⡗⢇
⢛⡯⣟⡾⣽⣻⣞⣷⣿⣿⣿⣿⣿⣿⣿⣿⣟⣷⣿⣿⣿⣿⣿⣟⣿⣽⣿⣯⡿⣷⢿⣻⣿⣿⣿⣿⣿⣽⣿⡟⡜⡜⡜⡌⢎⣪⢷⣻⣞⣦
⠨⡐⡭⡿⡯⡷⡿⣽⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣯⣿⣯⣿⣾⣯⣿⣿⣿⣿⡿⣯⢿⢽⡻⡯⡷⣫⢪⢪⢪⢪⡪⣞⡿⣟⣿⢿
⠨⢂⢙⢁⢂⢐⠐⡰⠖⡂⠅⡉⠩⣙⣛⠛⡻⠻⠻⠿⠿⡿⣿⢾⣯⣷⣿⣯⣷⣿⣿⣽⡯⡷⡯⣯⣺⣝⣮⡷⣝⡮⣞⢷⢽⢣⠣⡑⡙⢟
							""");
								
		aespa.add(new Idol("지젤", "외국인1", "Xenoglossy"));
		
		aespa.add(new Idol("윈터", "불자", "Armamenter"));

		aespa.add(new Idol("닝닝", "외국인2", "E.D Hacker"));
	
	}
	
	public List<Idol> findAll() {
		return aespa;
	}
	
	public Idol findMember(int memberNo) {
		/*
		if(member == 1) {
			return aespa.get(0);
		} else if(member == 2) {
			return aespa.get(1);
		} else if(memberNo == (3)) {
			return aespa.get(2);
		} else {
			return aespa.get(3);
		}
		*/
		return aespa.get(memberNo - 1);
	}
	
	// 사용자가 아이디를 입력했을 때 입력한 아이디가
	// fan들이 들어가는 List의 요소의userId필드값과 중복되는 게 있는지
	// 확인을 한 뒤에 결과를 View도 다시 반환
	public boolean checkId(String userId) {
		// 1. userId
		// 2. fans
		// 3. fans.get(i).getUserId()
		// 4. equals()
		for(int i = 0; i < fans.size(); i++) {
			if(userId.equals(fans.get(i).getUserId())) {
				return true;
			}
		}
		return false;
	}
	
	// 사용자가 입력한 아이디, 비밀번호, 닉네임을 View로부터 전달받아
	// 새로운 Fan이라는 객체를 생성하면서 필드에 값을 대입해주고
	// 생성된 Fan객체의 주소값을 내가 가지고 있는 Fan들이 들어가는 List의 요소로
	// 추가를 해주는 메소드를 구현을 해야함
	public boolean signUp(String userId, String userPwd, String nickName) {
		// 1. 데이터 가공 - 가공의 형태는 개발자가 정함
		Fan fan = new Fan(userId, userPwd, nickName);
		
		// 2. 요청 처리(아직 요청 처리하는 계층을 안배웠으므로 컨트롤러에서 처리)
		boolean result = checkId(userId);
		
		if(!result) {
			fans.add(fan);
		}
		
		// 3. 결과값 반환
		return result;
		
	}
	
	

}
