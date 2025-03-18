package ch03;

public class Code0324 {
    public static void main(String[] args) {
        // substring: String 자료형의 substring 메서드와 동일
        StringBuffer sb = new StringBuffer();

        sb.append("물개가 박수를 칩니다");
        System.out.println(sb.substring(4, 6));
   }
}
