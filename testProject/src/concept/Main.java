package concept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


//Hash Set 개념 공부 
//참조: https://reakwon.tistory.com/83

public class Main {

	public static void main(String[] args) {
		Set hashSet = new HashSet();
		hashSet.add("F");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("C");
		
		//같은 데이터들을 다시 ADD
		hashSet.add("F");
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("C");
		
		//HashSet의 "C"라는 원소 삭제
		hashSet.remove("C");
		
		//HashSet 모든 원소 출력
		System.out.println("HashSet 원소 출력");
		Iterator it = hashSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		//*같은 데이터들을 넣어도 한번만 출력되는 것 확인. 
		// -> HashSet은 중복을 허용하지 않기 때문
		
		// HashSet의 모든 원소를 ArrayList로 전달
		List arrayList = new ArrayList();
		arrayList.addAll(hashSet);
		
		// ArrayList의 모든 원소 출력
		System.out.println();
		System.out.println("ArrayList 원소 출력");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i)+ " ");
		}
	}
}
