Map클래스는 Key와 Value로 이뤄져 있는 데이터 구조입니다.
 

중요) Key는 중복이 불가합니다.
 

Map 종류
Map을 implement클래스는 4가지를 소개하겠습니다. Map의 다양한 구현 클래스 중 하나를 선택할 때, 
우리는 그 클래스의 특성과 퍼포먼스를 고려해야 합니다.
 
다음은 implemented된 주요 클래스입니다.
hashMap
hashTable
linkedHashMap
treeMap

 
HashMap은 Map 인터페이스의 구현 클래스 중에서 가장 많이 사용되는 클래스 중 하나입니다. HashMap은 해시 테이블로 구현되어 있
으며, key와 value 쌍을 저장합니다. HashMap은 내부 구조적으로 순서와 정렬을 유지하지 않습니다. 그리고, null 값을 key로 사용
할 수 있습니다. HashMap은 빠른 검색 속도를 제공합니다.

HashTable은 HashMap과 비슷한 기능을 제공하지만, Synchronized 되어 있어서 멀티 스레드 환경에서 안전하게 사용할 수 있습니
다. 하지만, null 값을 key로 사용할 수 없고, 느린 검색 속도로 인해 거의 사용하지 않습니다.

LinkedHashMap은 삽입 순서를 유지하는 해시 테이블로 구현된 Map 클래스입니다. 그리고, 정렬은 되지 않지만, 순서대로 데이터가 유
지도입니다.
 
이 구현 클래스는 최근에 추가된 항목에 더 높은 우선순위를 부여하는 LRU(Least Recently Used) 캐시를 구현하는 데 유용합니다.

TreeMap은 이진 검색 트리로 구현된 Map 클래스입니다. 이 구현 클래스는 정렬된 키 값 쌍의 집합을 유지합니다.
검색과 범위 검색 기능에서 뛰어난 성능을 제공합니다. TreeMap은 자동으로 오름차순으로 정렬합니다.
 
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("one")); // 1
        System.out.println(map.get("two")); // 2
        System.out.println(map.get("three")); // 3

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
위 코드는 HashMap을 사용한 간단한 예제 코드입니다.
put 메서드를 사용하여 key-value 쌍을 저장하고, get 메소드를 사용하여 key에 해당하는 값을 검색합니다.
그리고 entrySet 메소드를 사용한다면 HashMap의 모든 key-value 쌍을 검색할 수 있습니다.
