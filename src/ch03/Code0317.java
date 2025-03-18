package ch03;

public class Code0317 {
    public static void main(String[] args) {
        // 문자열 포매팅은 String.format 메서드 사용
        // 숫자는 %d, 문자열은 %s 대입
        System.out.println(String.format("%s(은)는 %s년 %s월 %s일생이다", "상록이", 2000, 7, 22)); // 상록이(은)는 2000년 7월 22일생이다
    }
}
