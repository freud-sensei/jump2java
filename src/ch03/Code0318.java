package ch03;

public class Code0318 {
    public static void main(String[] args) {
        // 길이가 10인 문자열에서 "안녕"을 우측 정렬
        System.out.println(String.format("상록아%10s", "안녕")); 
        // "상록아        안녕"

        // 길이가 10인 문자열에서 "안녕"을 좌측 정렬
        System.out.println(String.format("%-10s상록아", "안녕")); 
        // "안녕        상록아"
    }
}
