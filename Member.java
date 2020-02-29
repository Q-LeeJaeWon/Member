package member;


//자료형 클래스
public class Member {

//멤버변수, getter, setter

//멤버변수
//-> 입력, 출력에 관련된 모든 데이터 항목
//-> ID, PW, NAME, TEL, EMAIL
	private String id, pw, name, tel, email;

//번호(컬렉션 내부의 인덱스) 저장을 위한 멤버 변수 추가
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

//등급 저장용 멤버 변수 추가
//grade -> 관리자 0, 일반 회원 1
	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
//문제)
//toString() 메소드 오버라이딩 처리
//ID, NAME, TEL, EMAIL 출력 전용 -> String.format()
//반환자료형 String
	@Override
	public String toString() {
		return 
			"|| ID 입력 :" + id +
			" || PW 입력 :" + pw + 
			" || 이름 입력 :" + name + 
			" || 휴대폰 번호 입력 :" + tel + 
			" || Email 입력 :" + email + " || ";
	}
	
	

}
