package concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 주제: Stream
 *  - Java8부터 Stream 사용이 가능
 *  - Map, filter, sorted  
 * 	
 *  1. Map은 요소들을 특정조건에 해당하는 값으로 변환한다. 
 * 	2. filter는 요소들을 조건에 따라 걸러내는 작업을 한다. 
 * 	3. sorted는 요소들을 정렬해주는 작업을 한다. 
 * 
 * 참조: https://dpdpwl.tistory.com/81
 * @author kimtaemin
 *
 */
public class StreamEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Apple","Banana","Melon","Grape","Strawberry"));
		System.out.println(list);
		//map을 이용한 형태 변환 
		list.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		//filter를 이용한 조건 적용 
		list.stream().filter(t -> t.length() > 5).forEach(t -> System.out.println(t));
		String joiningStr = list.stream().filter(t -> t.length() > 5).collect(Collectors.joining(", "));
		System.out.println(joiningStr);
		
		ArrayList<String> strList = new ArrayList<String>();
		strList = (ArrayList<String>) list.stream().filter(t -> t.length() > 5).collect(Collectors.toList());
		
		for(String s : strList) {
			System.out.println(s);
		}
		
		//sorted를 통한 정렬 
		ArrayList<String> sortedList = new ArrayList<>();
		sortedList = (ArrayList<String>)list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
	}

}
