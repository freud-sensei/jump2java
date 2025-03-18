package ch03;

import java.util.Arrays;

public class Code0315 {
    public static void main(String[] args) {
        // split: 문자열을 구분자로 나눠 배열로 리턴
        String a = "김치 깍두기 스팸 라이스";
        String[] resultA = a.split(" "); // 빈칸이여도 값을 명시해야 함

        // 배열은 String으로 형 변환 후 출력해야 함
        System.out.println(Arrays.toString(resultA)); // [김치, 깍두기, 스팸, 라이스]

        String b = "서울시>관악구>봉천동";
        String[] resultB = b.split(">");
        System.out.println(Arrays.toString(resultB)); // [서울시, 관악구, 봉천동]
    }
}
