package member;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MenuAction 클래스의 객체 생성 과정 추가
		MenuAction menu = new MenuAction();

		Scanner sc = new Scanner(System.in);

		int i = 0;
//
//		do {
//			System.out.println("--- 회원 관리(컬렉션 자료구조 사용) ---");
//			System.out.println("1. 회원 가입");
//			System.out.println("2. 회원 명단 출력");
//			System.out.println("3. 회원 검색");
//			System.out.println("4. 관리자 모드");
//			System.out.print("선택(1~4, 0 종료)?");
//			int m = sc.nextInt();
//			// 문제)
//			// 0->프로그램 종료
//			// 1->회원 가입 액션->menuInsert() 메소드 호출
//			// 2->회원 명단 출력->menuSelect() 메소드 호출
//			// 3->회원 검색->menuSearch() 메소드 호출
//			// 4->관리자 모드->menuAdmin() 메소드 호출
//			if (m == 0) {
//
//				break;
//
//			}

		// 예외 처리 -> try~catch

//		}

		while (i != 5) {
			System.out.println("--- 회원 관리(컬렉션 자료구조 사용) ---");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 명단 출력");
			System.out.println("3. 회원 검색");
			System.out.println("4. 관리자 모드");
			System.out.print("선택(1~4, 0 종료) ? >>> ");

			i = sc.nextInt();
			switch (i) {

			case 1:
				
				menu.menuInsert(sc);

				Scanner sc1 = new Scanner(System.in);
				System.out.println("===================================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw1 = sc1.nextInt();

				if (otw1 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}
				break;

			case 2:
				System.out.println("========================================================");
				menu.menuSelect();
				
				Scanner sc2 = new Scanner(System.in);
				System.out.println("========================================================");
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				System.out.print(">>>>");
				int otw2 = sc2.nextInt();

				if (otw2 == 2) {
					System.out.println("안녕히계십시오");
					return;
				}

				break;

			case 3:

				break;

			case 4:

				break;

			case 0:

				break;
			}
		}

		sc.close();

	}

}
