package ch03;

public class Code0309 {
    public static void main(String[] args){
    // equals: 문자열 2개의 "값"이 같은지 비교해 return
String a = "홍창기";
String b = "신민재";
String c = "신민재";
String d = new String("신민재");
String e = new String("신민재");
System.out.println(a.equals(b)); // false - 다른 값
System.out.println(b.equals(c)); // true - 동일 값
System.out.println(b.equals(d)); // true - 동일 값
System.out.println(d.equals(e)); // true - 동일 값

// ==: 문자열 2개가 동일 객체인지 비교해 return
System.out.println(b == c); // true - 동일 객체
System.out.println(b == d); // false - 다른 객체
System.out.println(d == e); // false - 다른 객체
    }
}
