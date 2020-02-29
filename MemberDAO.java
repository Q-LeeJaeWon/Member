package member;
import java.util.ArrayList;
public class MemberDAO {

	// 회원 저장용 저장소 준비
	// -> ArrayList 컬렉션 클래스
	// -> Generic 표현 사용
	private ArrayList<Member> members;

	// 생성자 준비
	// -> 컬렉션 객체 생성 및 초기화
	public MemberDAO() {
		this.members = new ArrayList<Member>();
		this.init();
	}

	private void init() {
		// 문제)
		// 관리자(admin) 정보 사전 등록->필수
		// 샘플 사용자 정보 사전 등록->선택
		// 등급(grade) 지정
		// ->관리자 0, 일반회원 1

	}

	// 회원 정보 입력용 메소드 추가
	// ->외부에서 전달된 회원 정보(Member 자료형)를 가지고 저장소에 저장하는 액션
	public int add(Member member) {
		int result = 0;

		// 문제)
		// 저장소(컬렉션)에 저장하는 액션 추가
		// -> 저장된 후에는 결과값 1 반환

		return result;
	}

	// 회원 정보 출력용 메소드 추가
	// 반환자료형은 회원 정보 전체를 저장(컬렉션 권장)할 수 있는 자료형을 지정한다.
	// 회원 정보 전체를 반환하는 경우
	// 특정한 항목(ID)을 기준으로 정렬시킨 후 반환하도록 추가
	// ->Collections.sort(컬렉션, 정렬기준)
	public ArrayList<Member> list() {
		ArrayList<Member> result;

		result = this.members;

		// 문제) 정렬 액션 추가

		return result;
	}

	// 회원 정보 검색 결과용 메소드 추가
	public ArrayList<Member> searchList(String key, String value) {
		ArrayList<Member> result = new ArrayList<Member>();

		// 문제)
		// key는 검색 기준. 예를 들어 "ID"
		// value는 검색 단어. 예를 들어 "hong"
		// 원본 컬렉션인 members 에서 검색 진행
		// 검색 결과(Member 객체)만 result 컬렉션에 저장하는 액션

		return result;
	}

	// 관리자 로그인 액션 메소드
	public boolean adminLogin(String id, String pw) {
		boolean result = false;

		// 저장소(컬렉션)에 들어있는 id(중복없음), pw, grade(0) 검사
		// 관리자가 맞는 경우->true
		// 관리자가 아닌 경우->false

		return result;
	}

	// 회원 정보 삭제용 메소드 추가
	public int remove(int num) {
		int result = 0;

		// 외부에서 전달받은 번호(컬렉션 내부의 인덱스)를
		// 기준으로 삭제 진행
		// ->컬렉션에서 특정 요소 삭제

		return result;
	}

}
