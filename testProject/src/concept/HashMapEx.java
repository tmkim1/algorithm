package concept;

import java.util.HashMap;
import java.util.Map;


//HashMap 개념 공부 
//-출처: https://reakwon.tistory.com/151
public class HashMapEx {
	// 1. 맵이라는 것은 키(Key)와 값(Value) 두쌍으로 데이터를 보관하는 자료 구조이다.
	// 2. 맵에서 키는 유일한 값을 갖는다. 
	
	// - HashMap과 사용법이 거의 동일한 컬렉션(Collection)에는 HashTable이 있다. 
	// - 두 클래스의 차이점은 Thread 관점에서 안전하냐 (HashTable)				// 동기화 O
	// - 아전하지 않은 대신 속도가 빠르냐 (hashMap) // Thread-Safe 하지 않음.    // 동기화 X
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		
		map.put("A", 100);
		map.put("B", 101);
		map.put("C", 102);
		map.put("C", 103); // 중복된 key가 들어갈때는 이전 키, 값을 지금의 것으로 업데이트 
		System.out.println("map: " + map);   // map만 찍어도 map가지고 있는 값이 다 출력됨 // {A=100, B=101, C=103}
		System.out.println(map.get("A"));	// key를 이용하여 해당 값을 가져온다. 100
		System.out.println(map.get("B"));   // key를 이용하여 해당 값을 가져온다. 101
		System.out.println(map.get("C"));   // key를 이용하여 해당 값을 가져온다. 103 // update된 값 확인.
		
		//##### contatinsKey 메서드 사용
		if(!map.containsKey("C")) map.put("C", 104); //해당 키를 가지고 있지 않다면 put하기 때문에 이미 존재하는 key인 경우에는 update가 되지 않음.
		System.out.println(map.get("C"));
		
		map.putIfAbsent("C", 104); //위에 2줄 코드와 같은 기능
		
		//##### putAll 메서드 사용
		Map<String,Integer> map2 = new HashMap();
		map2.putAll(map);  //map에 있는 모든 값으 map2에 매핑
		System.out.println("map2: " + map2);
		
		//##### 생성자 대입
		Map<String,Integer> map3 = new HashMap(map);  //위에 2줄 코드를 생성자를 이용한 대입으로 똑같은 기능을 수행.
		System.out.println("map3: " + map3);
		
		//##### keySet 메서드 사용 (모든 키를 순회하는 코드) 
		for(String key : map.keySet()) {
			System.out.println("{"+key+", "+map.get(key)+"}");
		}
		
		//##### Foreach() 메소드로 순환
		map.forEach((key,value)->
		{
			System.out.println("{"+key+", "+map.get(key)+"}");
		});
	}
	
}
