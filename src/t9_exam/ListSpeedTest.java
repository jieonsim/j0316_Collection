package t9_exam; // 평가에 있다고함.. 할 수 있어야 한다고함.... 씨앙

import java.util.*;

// List 계열의 자료 구조 수행 속도 비교
public class ListSpeedTest {
	public static void main(String[] args) {
//		Vector<String> vos1 = new Vector<String>();
//		ArrayList<String> vos2 = new ArrayList<String>();
//		LinkedList<String> vos3 = new LinkedList<String>();

		List<String> vos1 = new Vector<String>();
		List<String> vos2 = new ArrayList<String>();
		List<String> vos3 = new LinkedList<String>();

		int su = 100000;
		long startTime, endTime;

		// 자료의 삽입, 삭제 비교		
		System.out.println("1. 0번 인덱스에 자료 추가하기");

		// 1. Vector
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos1.add(0, "홍길동1" + i);
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns"); // ns : 나노세컨드
		System.out.println();

		// 2. ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos2.add(0, "홍길동1" + i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();

		// 3. LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos3.add(0, "홍길동1" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		System.out.println("--------------------------------------------");
		
		/*
		System.out.println("2. 0번 인덱스에 자료 삭제하기");
		
		// 1. Vector
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos1.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns"); // ns : 나노초
		System.out.println();

		// 2. ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos2.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();

		// 3. LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos3.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		System.out.println("--------------------------------------------");
		*/
		
		System.out.println("3. i번 인덱스 내용 검색하기");
		
		// 1. Vector
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns"); // ns : 나노초
		System.out.println();
		
		// 2. ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos2.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
		// 3. LinkedList
		startTime = System.nanoTime();
		for (int i = 0; i < su; i++) {
			vos3.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행 시간 :\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
	}
}
