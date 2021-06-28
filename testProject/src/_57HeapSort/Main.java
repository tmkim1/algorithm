package _57HeapSort;

/**
 * 힙정렬 
 * 완전이진트리를 기반으로하는 힙 자료구조 기반 정렬 방
 * 완전이진트리: 노드가 비어 있지 않고, 빽빽히 가득 찬 구조 // 노드 추가는 왼쪽부터 진행 
 *
 *  최대 힙을 구성 
 *  heapify: 일반 배열을 힙으로 구성하는 역할, 자식 노드로부터 부모노드 비교 
 *  
 *  힙 소트가 유용한 경우) 가장 크거나 가장 작은 값을 구할떄 
 * 
 *  @출처 
 *  1. 테크 인터뷰: https://gyoogle.dev/blog/algorithm/Insertion%20Sort.html 
 *  2. 도서: 처음 만나는 알고리즘
 *  3. 강의: 엔지니어 대한민국 (https://www.youtube.com/watch?v=Vi0hauJemxA)
 * 
 * @author kimtaemin
 *
 */

public class Main {
	public static void main(String[] args) {
		int[] array = { 230, 10, 60, 550, 40, 220, 20 };
		 
	    heapSort(array);
	 
	    for (int v : array) {
	        System.out.println(v);
	    }
	}
	
	public static void heapify(int array[], int n, int i) {
		int p = i;
		int l = i * 2 + 1;
		int r = i * 2 + 2;
		
		if( l < n && array[p] < array[l]) {
			p = l;
		}
		
		if(r < n && array[p] < array[r]) {
			p = r;
		}
		
		if (i != p) {
			swap(array, p, i);
			heapify(array, n, p);
		}
	}
	
	
	public static void heapSort(int[] array) {
		int n = array.length;
		
		//init, maxheap
		for(int i = n / 2 - 1; i >= 0; i--) {    // i = n/2 -1 트리에 특징에 따른 공식 
			heapify(array, n, i);
		}
		
		for(int i = n-1; i > 0; i--) {
			swap(array, 0, i);
			heapify(array, i, 0);
		}
		
	}
	
	public static void swap(int[] array,int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	
}
