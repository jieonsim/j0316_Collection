package t4_Set;

import java.util.*;

/*
	TreeSet : Set 계열 자료 구조, 집합 자료 구조,
	HashSet과의 차이점 : 순서없이 들어가있는 자료를 꺼낼 때는 정렬되어 꺼내준다.
 */
public class T2_TreeSet {
	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

//		for (int i = 0; i < 10; i++) {
//			treeSet.add((int) (Math.random() * 100) + 1);
//		}
//		treeSet.add(5); // 뒤늦게 추가한 5가 정렬 순 마지막이 아님
//		treeSet.add(5); // 5를 두번 넣는다고해서 두번 들어가지 않음, 중복 배제

		for (int i = 50; i > 0; i -= 2) { // 50부터 0전까지 2씩뺀다. (짝수출력)
			treeSet.add(i);
		}
		System.out.println("1. 크기 : " + treeSet.size());
		System.out.println("1. treeSet : " + treeSet); // 들어갈 때는 아무렇게나 들어가도 나올 때는 정렬되어 출력됨
		System.out.println();

		System.out.println("2. first() : " + treeSet.first()); // 가장 작은
		System.out.println("3. last(): " + treeSet.last()); // 가장 큰
		System.out.println("4. lower() : " + treeSet.lower(26)); // 입력한 숫자보다 작은 것 중 가장 큰 거
		System.out.println("5. higher() : " + treeSet.higher(26)); // 입력한 숫자보다 큰 것 중 가장 작은 거
		System.out.println("6. floor() : " + treeSet.floor(25)); // 입력한 숫자보다 같거나 작은 것 중 가장 큰 거
		System.out.println("7. ceiling() : " + treeSet.ceiling(25)); // 입력한 숫자보다 같거나 큰 것 중 가장 작은 거
		System.out.println();

		// pollFirst() : 원소들 중에서 가장 작은 원소값 순차대로 꺼내어 리턴
		System.out.println("8. size(): " + treeSet.size());
		System.out.print("8. pollFirst(): ");
		for (int i = 0; i < 25; i++) {
			System.out.print(treeSet.pollFirst() + " ");

		}
		System.out.println();
		
		for (int i = 50; i > 0; i-=2) {
			treeSet.add(i);
		}
		
		// pollLast() : 원소들 중에서 가장 큰 원소값 순차대로 꺼내어 리턴
		System.out.println("9. size(): " + treeSet.size());
		System.out.print("9. pollLast(): ");
		for (int i = 0; i < 25; i++) {
			System.out.print(treeSet.pollLast() + " ");
		}
		System.out.println();
	}
}
