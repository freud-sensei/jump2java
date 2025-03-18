package ch03;

public class Code0304 {
    public static void main(String[] args) {
        // int는 자동으로 double로 변환되어 계산
        int a = 10;
        double b = 3;
        System.out.println(a + b); // 13.0
        System.out.println(a - b); // 7.0
        System.out.println(a * b); // 30.0
        System.out.println(a / b); // 3.333...
        System.out.println(a % b); // 1.0, 나머지 연산자
    }
}
