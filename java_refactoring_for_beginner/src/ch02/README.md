# 제어 플래그 삭제

제어 플래그를 지나치게 사용하면 코드가 읽기 어려워진다.

- 제어 플래그 네이밍은 의미있게
  - error
  - done
  - recurse
  - initialized
  - interrupted


- 제어 플래그 삭제
  - 반복문 중 제어플래그가 원하는 값으로 변경됐다면 break 활용
  - 제어 플래그를 바로 반환해도 되는 상황이라면 return 활용