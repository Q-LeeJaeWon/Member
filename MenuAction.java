package member;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MenuAction {

	// MemberDAO 클래스의 객체를 멤버변수로 등록
//	MemberDAO dao = new MemberDAO();
	private MemberDAO dao;
	Member member = new Member();

	ArrayList<Member> arraylist = new ArrayList<Member>();


	public MenuAction() {
		// 멤버변수 dao에 대한 초기화
		this.dao = new MemberDAO();
	}

//	 id, pw, name, tel, email;
	// 1. 회원 가입 (ID, PW, NAME, TEL, EMAIL)

	// 문제)
	// 콘솔 환경에서 외부 데이터 입력.
	// 입력 항목->ID, PW, NAME, TEL, EMAIL
	// 신규 Member 객체에 입력 데이터를 저장
	// MemberDAO 객체의 add() 메소드 호출
	// "회원정보가 추가되었습니다." 메시지 출력
	public void menuInsert(Scanner sc) {
		Member member = new Member();
		
		System.out.println("===================================");
		System.out.println(" [ 1.회원 가입  ] ");

		try {

			System.out.print("ID 입력 : ");
			String id = sc.next();
			member.setId(id);

			System.out.print("PW 입력 : ");
			String pw = sc.next();
			member.setPw(pw);

			System.out.print("이름 입력 : ");
			String name = sc.next();
			member.setName(name);

			System.out.print("휴대폰 번호 입력 : ");
			String tel = sc.next();
			member.setTel(tel);

			System.out.print("Email 입력 : ");
			String email = sc.next();
			member.setEmail(email);

			arraylist.add(member);

		} catch (InputMismatchException e) {
			System.out.println("입력하세요");
			// 잘못입력된 값 비워주기
			sc.nextLine();

		}

	}

	// 2. 회원 명단 출력
	public void menuSelect() {

		// 문제)
		// 저장소로부터 회원 정보 전체를 반환하는 메소드 호출
		// ->list()->ArrayList<Member>
		// ->컬렉션에 들어있는 회원 정보(Member 자료형-ID, NAME, TEL, EMAIL)를 순차적으로 출력
		// ->향상된 for문 이용
		
		// 카운터
		int count = 1;

		try {
			if (arraylist.size() == 0) {
				throw new IndexOutOfBoundsException("저장된 정보가 없습니다.");
			}
			for (int i = 0; i < arraylist.size(); i++) {
				System.out.println("[ " + count + " 번째 회원 정보 ] ");

				// ArrayList에 저장된 모든 객체 출력해서 보여주기
				System.out.println(arraylist.get(i));
				count += 1;
			}
		} catch (IndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
		}

	}

	// 3. 회원 검색
	public void menuSearch(Scanner sc) {
		// 서브메뉴 운영
		do {
			System.out.println("--- 회원 검색 서브 메뉴 ---");
			System.out.println("1. ID");
			System.out.println("2. NAME");
			System.out.println("3. TEL");
			System.out.print("선택(1~3, 0 종료)?");
			int m = sc.nextInt();
			if (m == 0) {
				break;
			}

			// 문제)
			// 1-> ID 기준 검색 액션 -> private 메소드 처리 -> key
			// 2-> NAME 기준 검색 액션 -> private 메소드 처리 -> key
			// 3-> TEL 기준 검색 액션 -> private 메소드 처리 -> key

		} while (true);
	}

	// 검색 액션 전용 private 메소드
	private void searchList(Scanner sc, String key) {

		// 문제)
		// 검색 단어(value) 외부 입력
		// 검색 액션 메소드 호출 -> MemberDAO 클래스의 검색 메소드 호출 ->key, value

		// 결과값은 ArrayList<Member> 자료형
		// ->컬렉션에 들어있는 회원 정보(Member 자료형-ID, NAME, TEL, EMAIL)를 순차적으로 출력
		// ->향상된 for문 이용

		// 결과가 없는 경우 "검색 결과가 없습니다." 메시지 출력

	}

	// 4. 관리자 모드
	public void menuAdmin(Scanner sc) {

		// 문제)
		// 로그인 액션
		// ID(admin), PW 외부 입력
		// ->MemberDAO 클래스의 login() 메소드 호출
		// ->id, pw 매개변수에 전달
		// ->결과가 true인 경우 로그인 성공->삭제 액션 진행->private 메소드
		// ->결과가 false인 경우 로그인 실패->예외 발생

	}

	private void adminDelete(Scanner sc) {

		// 문제)
		// 삭제 액션
		// 삭제 대상 검색 진행 -> ID, NAME 기준 -> 서브 메뉴 운영
		// ->private 메소드 추가

		// 검색 결과 출력후 삭제 대상 확인 및 삭제 여부 확인
		// ->(NAME 기준인 경우) 동명이인 처리
		// ->번호(컬렉션 내부의 인덱스) 출력 및 번호 선택 과정 추가

		// ->삭제는 번호(컬렉션 내부의 인덱스)를 기준으로 삭제 액션 진행.
		// ->MemberDAO 클래스에서 remove() 메소드 호출
		// ->번호(컬렉션 내부의 인덱스)를 매개변수에 전달

	}

}
