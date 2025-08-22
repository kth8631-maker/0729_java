package com.kh.practice.list.music.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 : ");
			
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch(menuNo) {
				case 1 : addList(); break;
				case 2 : addAtZero(); break;
				case 3 : printAll(); break;
				case 4 : break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 8 : break;
				case 9 : System.out.println("프로그램 종료");
				default : System.out.println("다시 선택해주세요.");
					}
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine();
			}
		}
	}
	
	public void addList() {
		
		System.out.println();
		System.out.println("\n***** 마지막 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		
		int musicNo = mc.addList(title, singer);
		if(musicNo == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	
	}
	
	public void addAtZero() {
		
		System.out.println();
		System.out.println("\n***** 첫 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		
		mc.addAtZero(title, singer);
		
		System.out.println("추가 성공");
	}
	public void printAll() {
		
		System.out.println();
		System.out.println("***** 전체 곡 목록 출력 *****");
		
		List<Music> music = mc.printAll();
		
		if(music.isEmpty()) {
			System.out.println("곡이 없습니다.");
		} else {
			for(Music m : music) {
				System.out.println("곡 명 : " + m.getTitle() + ", 가수 명 : " + m.getSinger());
			}
		}
		
	}

}
