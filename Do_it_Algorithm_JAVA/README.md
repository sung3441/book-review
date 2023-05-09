# Do it! 알고리즘 코딩테스트 - JAVA

## ch01

### 시간 복잡도

- 연산 횟수는 1초에 1억 번 연산하는 것을 기준
- 시간 복잡도는 항상 최악으로 생각, 입력 데이터의 크기를 가장 크게 가정
- 연산 횟수 = 알고리즘 * 데이터의 크기
- 시간 복잡도 도출 기준
  - 상수는 시간 복잡도 계산에서 제외
  - 가장 많이 중첩된 반복문의 수행 횟수가 시간 복잡도의 기준

```java
public class Main {
    public static void main(String[] args) {
        int N = 100;
        for (int i = 0; i < N; i++) {
            // ...
        }
    }    
}
```
```java
public class Main {
    public static void main(String[] args) {
        int N = 100;
        for (int i = 0; i < N; i++) {
            // ...
        }

        for (int i = 0; i < N; i++) {
          // ...
        }

        for (int i = 0; i < N; i++) {
          // ...
        }
    }    
}
```

위 두 코드의 시간 복잡도는 O(n)으로 같다. 상수는 무시되기 때문

```java
public class Main {
    public static void main(String[] args) {
        int N = 100;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
              // ...
            }
        }
    }    
}
```

시간 복잡도는 가장 많이 중첩된 반복문을 기준으로 도출하므로, 위 코드의 시간 복잡도는 N의 제곱이다.

## ch02

### 디버깅

- 테스트 중 잦은 실수
  - 변수 초기화 오류
  - 반복문 인덱스 범위 지정 실수
  - 잘못된 변수 사용
  - 자료형 범위 오류
    - 처음부터 long 자료형을 선언하는 것으로 오류를 예방할 수 있음