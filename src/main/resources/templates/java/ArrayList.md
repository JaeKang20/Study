
# 자료구조와 관련된 클래스의 내부적 동작

자바 언어에서 자료구조와 관련 된 클래스가 내부적으로 어떻게 동작하는지
한 가지 사례를 정하여 작성하겠습니다. 제가 선택한 자료구조는 ArrayList이며

공식문서를 참고 했습니다.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html

### ArrayList가 implements한 인터페이스는 Serializable,Cloneable, Iterable, Collection, List, RandomAccessed 입니다.

-----
Serializable은 클래스 인터페이스를 직렬로 구현하는게 가능해집니다.

Cloneable은 객체를 복사할 수 있게 해줍니다.

Iterable은 Collection객체들을 (ArrayList의 부모 클래스임)반복을 할 수 있게 해줍니다.\
List는 순서가 있는 컬렉션으로 중복된 요소를 허용할 수 있습니다.

RandomAccess는 List인터페이스를  구현한 객체를 빠른 액세스를 접근해주는 역할입니다.

-----
이렇게 ArrayList를 호출하면 내부적으로 구현한 인터페이스들이 작동됩니다.
특히 List에서 구현한 get(),set(),indexOf()등의 메서드를 사용하여 요소의 조회,
수정, 인덱스 검색 등을 수행할 수 있습니다.