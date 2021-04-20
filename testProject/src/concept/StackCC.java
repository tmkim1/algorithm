package concept;

import java.util.Stack;

// Stack 개념 공부 
// 참조: https://wakestand.tistory.com/197

public class StackCC {

	public static void main(String[] args) {
		Stack stk = new Stack<String>();
		stk.add("first");
		stk.add("second");
		stk.add("third");
		
		// third  //
		// second //
		// frist  //
		
		//1. 스택에 해당 값이 있는지 확인 
		System.out.println("Stack안에 first 보유 확인:: " + stk.contains("first"));
		System.out.println("Stack안에 firs 보유 확인:: " + stk.contains("firs"));
		
		//2. Stack에서 값을 꺼낸다.
		System.out.println("Stack pop: " + stk.peek()); // LIFO 구조 // 마지막에 들어온 값이 가장 먼저 꺼내짐. 
		
		//3. 특정 인덱스의 값 확인
		System.out.println("0번째 인덱스 값 확인: " + stk.elementAt(0));
		System.out.println();
		
		//4. 전체 출력 
		for(int i=0; i<stk.size(); i++) {
			System.out.println(i+"번째 인덱스 값 확인: " + stk.elementAt(i));
		}
		
		//5. 특정 값의 인덱스 확인 
		System.out.println("Secend ::" + stk.indexOf("second")); // Index는 0부터 시작하기 떄문에 Second는 Index = 1 값을 갖는다. 
		
		//6. index: 2에 해당하는 값 제거 
		stk.remove("2"); // third
		
		//7. Stack의 특정 인덱스 값 변경 
		stk.set(1, "secondAll");
		
		System.out.println("Index = 1의 값 :: " + stk.elementAt(1));
		
		//8. 스택 비우기 
		stk.clear();
		System.out.println("stack 공백 상태 유무:: " + stk.empty()); // 비어있는지 확인
		
	}

}
