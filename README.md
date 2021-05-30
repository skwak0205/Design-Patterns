# Java Design Pattern

### 1. Singleton Pattern

- getInstance() 메소드를 통해 오직 하나의 객체(인스턴스)만 생성이 되고, 어떤 클라이언트든 같은 인스턴스를 참조함
- 만드는 방법
  1. Private 생성자
  2. Private static 인스턴스 변수
  3. Public static getInstance() method 구현

### 2. Strategy Pattern

- 여러 알고리즘을 **하나의 추상적인 접근점(Interface)**을 만들어 접근점에서 서로 교환 가능하도록 하는 패턴
- 특징
  - 관련 알고리즘 집합을 형성할 수 있음
  - 알고리즘의 선택 혹은 대체가 가능함
  - 알고리즘 객체 수가 증가함
