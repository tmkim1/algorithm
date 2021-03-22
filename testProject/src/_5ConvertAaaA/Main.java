package _5ConvertAaaA;

public class Main {

	public static void main(String[] args) {
		
		// 문자는 아스키 코드 값을 가지고 있다.
		String input = "HelloWorld";
		char[] arr;
		// String 문자열을 -> char[] 배열로 전환하여 저장
		arr = input.toCharArray();
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + ('A'-'a'));     // 아스키 32 차이 남.
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A'-'a'));
			}
		}
		
		System.out.println(arr);
		System.out.println('A'-'a');

	}

}
