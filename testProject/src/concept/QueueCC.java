package concept;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCC {
	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<String>();
		
		que.offer("first");
		que.offer("second");
		que.offer("third");
		
		// 값 포함 여부:  contains()
		System.out.println("Queue 값 포함 여부: " + que.contains("first"));
		
		// 값 추출: peek() 
		System.out.println("값 추출: " + que.peek());

		// 크기 확인
		System.out.println("size:" + que.size());
		
		// Queue 안에 특정 값 제거 
		que.remove("second");
		
		for(int i = 0; i < que.size();) {
			System.out.println(que.poll());	//꺼내면서 추출 
		}
		
		System.out.println("비었는지 확인:" + que.isEmpty());
		
		que.clear();
		
	}
}
