package ch02;

// 클래스 블록
// public: 접근 제어자 - 어디서든 Sample 클래스에 접근할 수 있다
// class: 클래스 블록을 만드는 키워드
public class Code0201 {

    // static: 클래스 메서드가 되어, 객체를 만들지 않아도 클래스명.메서드명 형태로 출력할 수 있다
    // void: 리턴값이 없음 (리턴 자료형이 있을 땐 이를 명시)
    // String[] args: args 변수는 String[] 배열 자료형임을 의미
    public static void main(String[] args) {
        // 명령문에는 반드시 세미콜론(;)을 붙여야 함
        System.out.println("Home sweet home");
    }
}