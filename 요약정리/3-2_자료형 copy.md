# 소감

- JS나 Python에서 봤던 메서드들이랑 전체적으로는 이름만 다르고 기능이 비슷한 경우가 많아 크게 어렵지 않았다.
- 리터럴 표기 방식과 `new` 키워드의 차이가 아직 잘 와닿지는 않는다. 나중에 객체를 더 배워야 100% 이해될 것 같다.
- 불변한 문자열을 가변하게 다룰 수 있는 `StringBuffer` 객체의 존재가 꽤나 새로웠다. 실무에서도 많이 쓰이는지 궁금하다.

# 문자열 (String)

- 문자로 구성된 문장

## 문자열 선언하기 ★★★

```
String a = "무적엘지 오스틴 딘 날려버려라 오스틴 딘";
String b = "a";
String c = new String("20000722");
```

- 방법 1: String은 원시 자료형이 아니지만, 값을 대입하여 (리터럴 표기 방식) 선언 가능
  - ★★★ 같은 값을 가질 경우, 각 변수는 동일 객체를 참조하게 됨
- 방법 2: 객체를 만들 때 사용하는 new 키워드로 선언 가능
  - ★★★ 같은 값이더라도, 매번 새로운 객체가 생성됨
- 방법 1을 사용하는 게 속편함. `equals` 메서드 설명 참고.

## 문자열 내장 메서드

### `length`

```
// length: 문자열의 길이를 return
String a = "오늘은 나만 믿고 따라와";
System.out.println(a.length()); // 13
```

### `charAt`

```
String sentence = "요구르트 마시면 살이 빠져요";
System.out.println(a.charAt(3)); // 트
```

- `sentence[3]` 식의 인덱싱은 Java에선 불가능하다. (문자열 말고 배열에선 가능하다)

### `equals` ★★★

```
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
```

- ★★★ `==`는 2개의 자료형이 같은 **객체**인지, 즉 참조하는 메모리 주소가 같은지 판별하므로, `false`를 반환
  - `b`, `c`: 리터럴 표기 방식으로 선언될 시, 같은 값 (`"신민재"`)을 가지는 문자열은 하나의 동일 객체로 처리함. 즉 `b`와 `c`는 동일 주소를 가리킴
  - `d`: `new`를 사용해 선언할 시, 새로운 객체가 생성됨. 값이 동일하지만, `d`는 `b`, `c`와 다른 메모리 주소를 가리킴.
  - `e`: 이때도 새로운 객체가 생성되어, `b`, `c`, `d`와 다른 메모리 주소를 가리킴.
  - 객체 관련 개념은 5장에서 더 다룸
- 같은 **값**인지 판단하고 싶으면 `equals`를 사용해야 함

### `indexOf`

```
// indexOf: 특정 문자열이 시작하는 위치 return
String a = "Home sweet home";
System.out.println(a.indexOf("sweet")); // 5
```

### `contains`

```
// contains: 특정 문자열의 포함 여부 return
String a = "오늘은 내가 짜파게티 요리사";
System.out.println(a.contains("짜파게티")); // true
System.out.println(a.contains("진짜장")); // false
```

### `replaceAll`

```
// replaceAll: 특정 문자열을 다른 문자열로 변경해 return
String a = "철수는 점심밥으로 오뚜기밥을 먹었다.";
System.out.println(a.replaceAll("밥", "빵")); // "철수는 점심빵으로 오뚜기빵을 먹었다."
```

### `substring`

```
// substring: 문자열에서 특정 문자열을 뽑아내 return
String a = "역시 나는 천재야";
System.out.println(a.substring(6, 8)); // "천재"
System.out.println(a.substring(6, a.length())); // "천재야"
```

### `toUpperCase, toLowerCase`

```
String a = "hI i Am StrAwbErry";

// toUpperCase: 문자열을 모두 대문자로 바꿔 return
System.out.println(a.toUpperCase()); // "HI I AM STRAWBERRY"

// toLowerCase: 문자열을 모두 소문자로 바꿔 return
System.out.println(a.toLowerCase()); // "hi i am strawberry"
```

### `split` ★

```
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
```

- ★ 빈칸을 구분자로 나눠도 `" "` 빈 칸을 명시해야 함
- 배열을 직접 출력하면 주소값이 출력되므로, `Arrays.toString()`을 이용해 문자열로 형 변환이 필요함

## 문자열 포매팅

```
// 문자열 포매팅은 String.format 메서드 사용
// 숫자는 %d, 문자열은 %s 대입

System.out.println(String.format("%s(은)는 %d년 %d월 %d일생이다", "상록이", 2000, 7, 22)); // 상록이(은)는 2000년 7월 22일생이다
```

### 정렬과 공백 표현

```
// 길이가 10인 문자열에서 "안녕"을 우측 정렬
System.out.println(String.format("상록아%10s", "안녕"));
// "상록아        안녕"

// 길이가 10인 문자열에서 "안녕"을 좌측 정렬
System.out.println(String.format("%-10s상록아", "안녕"));
// "안녕        상록아"
```

### 소수점 표현

```
// 소수점 넷째 자리까지만 (반올림)
System.out.println(String.format("%.4f", 1.23459)); // 1.2346

// 소수점 넷째 짜리까지 반올림 및 우측 정렬
System.out.println(String.format("%10.4f", 1.23459)); // "    1.2346"
```

### `System.out.printf`

```
// System.out.printf: String.format 메서드 없이도 포매팅된 문자열을 출력
System.out.printf("오늘 %s의 날씨는 %3.1f도 입니다", "서울", 15.737);
// 오늘 서울의 날씨는 15.7도 입니다
```

- 포매팅한 문자열을 출력하는 거지, 리턴하는 게 아님에 유의하자.

# StringBuffer

- 문자열을 추가하거나 변경할 때 주로 사용
- `StringBuffer` 객체는 `append` 등 메서드로 값을 변경할 수 있다 (mutable)
- `String` 객체는 값을 변경할 수 없다 (immutable)
- 하지만 `StringBuffer`는 `String`에 비해 메모리 사용량도 많고 속도도 느림

### `append`

```
// StringBuffer 객체 sb 생성
StringBuffer sb = new StringBuffer();

// append: StringBuffer에 문자열을 추가
sb.append("오늘은");
sb.append(" ");
sb.append("토요일");

// toString: StringBuffer를 String 자료형으로 변경
String result = sb.toString();
System.out.println(result); // 오늘은 토요일
```

- 본 예제에서는 `StringBuffer` 객체를 **한 번만** 생성한다.

```
String result = "";

result += "오늘은";
result += " ";
result += "토요일";

System.out.println(result); // 오늘은 토요일
```

- 본 예제에서는 `+` 연산마다 새로운 `String` 객체가 생성된다.
- 이유: `String` 자료형은 값이 생성되면 변경할 수 없으므로, 매번 새로 만들어줘야 함

### `insert`

```
StringBuffer sb = new StringBuffer();

sb.append("오늘도 정말 못말려");
sb.insert(0, "짱구는 ");
String result = sb.toString();

System.out.println(result); // 짱구는 오늘도 정말 못말려
```

### `substring`

```
// substring: StringBuffer에서 특정 문자열을 뽑아내 return
StringBuffer sb = new StringBuffer();

sb.append("물개가 박수를 칩니다");
System.out.println(sb.substring(4, 6)); // 박수
```
