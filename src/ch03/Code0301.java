package ch03;

public class Code0301 {
    // 1. 정수
    // long은 int로 표현할 수 없는 큰 값을 다룰 때 사용
    int weight = 70;
    long futureMoney = 8764827384923849L; // 끝에 L 붙여야 함

    // 2. 실수
    // double은 float보다 더 높은 정밀도가 필요한 실수 계산에 사용
    // float는 메모리 절약이 중요한 경우 사용
    float gpa = 4.3F; // 끝에 F 붙여야 함
    double pi = 3.141592;
    double d1 = 1.234e2; // 1.234 * (10 ** 2) = 123.4
    double d2 = 1.234e-2; // 1.234 * (10 ** (-2)) = 0.01234

    // 3. 8진수, 16진수
    // 8진수는 0으로 시작
    int octal = 023; // 3 * 1 + 2 * 8 = 19
    // 16진수는 0x로 시작
    int hex = 0xC3; // 3 * 1 + 12(C) * 16 = 195
}
