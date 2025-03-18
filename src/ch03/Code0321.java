package ch03;

public class Code0321 {
    public static void main(String[] args) {
        // StringBuffer 객체 sb 생성
        StringBuffer sb = new StringBuffer();

        // append: StringBuffer에 문자열을 추가
        sb.append("오늘은");
        sb.append(" ");
        sb.append("토요일");

        // toString: StringBuffer를 String 자료형으로 변경
        String result = sb.toString();
        System.out.println(result); // 오늘은 토요일
   }
}
