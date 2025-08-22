package com.kh.practice.list.library.view;


import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	// 프로그램 실행 시 보여줄 화면을 출력해주는 기능
	public void mainMenu() {
		// 저장소 : ArrayList
		while(true) {
			System.out.println();
			System.out.println("===== Welcome KH Library =====");
			System.out.println();
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.println();
			System.out.print("메뉴 번호 입력 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
		
				switch(menuNo) {
				case 1 : insertBook(); break;
				case 2 : selectList(); break;
				case 3 : searchBook(); break;
				case 4 : deleteBook(); break;
				case 5 : break;
				case 9 : System.out.println("프로그램 종료"); return;

				}
		}
	}
	// 1. 새로운 도서 추가 화면을 보여주는 메소드
	public void insertBook() {
		String category = "";
		System.out.println();
		System.out.println("\n ===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		System.out.print("도서 명 : ");
		String title = sc.nextLine();
		System.out.print("저자 명 : ");
		String author = sc.nextLine();
		System.out.print("장르(1.인문 / 2.과학 / 3.외국어 /4.기타) : ");
		int categoryNo = sc.nextInt();
		if(categoryNo < 1 || categoryNo > 4) {
			System.out.println("없는 메뉴입니다.");
		} else { 
			switch(categoryNo) {
			case 1 : category = "인문"; break;
			case 2 : category = "과학"; break;
			case 3 : category = "외국어"; break;
			case 4 : category = "기타"; break;
			}
		}
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		// 사용자가 입력한 도서 정보를 도서목록에 추가 요청
		boolean result = bc.createBook(title, author, category, price);
	if(result) { System.out.println("새로운 도서가 추가되었습니다");
	
	} else { System.out.println("도서 추가에 실패했습니다.");
  }
}
	
	// 2. 전체 도서 목록을 출력
	public void selectList() {
		
		System.out.println();
		System.out.println("===== 도서 전체 조회 =====");
		
		List<Book> books = bc.selectList();
		
		if(books.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for(Book b : books) {
				System.out.println("도서 명 : " + b.getTitle() + 
						", 저자 명 : " + b.getAuthor() + ", 장르 : " + b.getCategory() + 
						", 가격 : " + b.getPrice());
			}
		}
	}
	// 3. 사용자가 식물에 대한 키워드 입력 시 화면 출력
	public void searchBook() {
		
		System.out.println();
		System.out.println("===== 도서 검색 =====");
		System.out.println("검색키워드 : ");
		String keyword = sc.nextLine();
		
		List<Book> searched = bc.searchBook(keyword);
		
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println("검색키워드 : " + keyword);
			
			for(Book b : searched) {
				System.out.println(b.getTitle() + "/" + b.getAuthor() + "/" + b.getCategory() + "/" + b.getPrice());
			}
		}
	}
	
	public void deleteBook() {
		
		System.out.println();
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();
		
		int count = bc.deleteBook(title, author);
		
		if(count > 0) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		System.out.println();
		
	}
	

}

