package ch03;

public class Code0319 {
    public static void main(String[] args) {
        // 소수점 넷째 자리까지만 (반올림)
        System.out.println(String.format("%.4f", 1.23459)); // 1.2346

        // 소수점 넷째 짜리까지 반올림 및 우측 정렬
        System.out.println(String.format("%10.4f", 1.23459)); // "    1.2346"
   }
}
