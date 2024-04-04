package t5_Map;

import java.util.*;

public class T3_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		System.out.println("1. 크기 : " + treeMap.size());
		System.out.println("1. toString : " + treeMap.toString()); // 이거랑
		System.out.println("1. toString : " + treeMap); // 이거랑 값은 같음
		System.out.println();

		treeMap.put(11, "홍길동");
		treeMap.put(13, "고말숙");
		treeMap.put(21, "고인돌");
		treeMap.put(15, "이기자");
		treeMap.put(17, "강감찬");
		treeMap.put(19, "오사랑");

		// 키 순서대로 나옴
		System.out.println("2. 크기 : " + treeMap.size());
		System.out.println("2. toString : " + treeMap);
		System.out.println();

		// 역순으로 TreeMap에 값을 입력한 후 출력시키면 키 값으로 오름차순 정렬되어 출력된다.
		for (int i = 20; i > 0; i -= 2) {
			System.out.println("i : " + i);
			treeMap.put(i, i + "번째");
		}
		System.out.println();

		System.out.println("3. 크기 : " + treeMap.size());
		System.out.println("3. toString : " + treeMap);
		System.out.println();
		
		// 첫번째 키 값 보여주기 : firstkey(), 마지막 키 / 값 : lastkey()
		System.out.println("4. 첫번째 키 : " + treeMap.firstKey());
		System.out.println("4. 첫번째 키와 값 : " + treeMap.firstEntry());
		System.out.println("4. 마지막 키 : " + treeMap.lastKey());
		System.out.println("4. 마지막 키와 값 : " + treeMap.lastEntry());
		System.out.println();
		
		// 검색키보다 작은 자료 중에서 최소값 / 최대값 : lowerkey(), higherkey();
		System.out.println("5. 검색 키보다 작은 자료 중에 최대값 : " + treeMap.lowerKey(11));
		System.out.println("5. 검색 키보다 작은 자료 중에 최대값 : " + treeMap.lowerKey(10));
		System.out.println("5. 검색 키보다 큰 자료 중에 최소값 : " + treeMap.higherKey(11));
		System.out.println("5. 검색 키보다 큰 자료 중에 최소값 : " + treeMap.higherKey(10));
		System.out.println();
		System.out.println("5. 크기 : " + treeMap.size());
		System.out.println("5. toString : " + treeMap);
		System.out.println();

		// 자료 제거 : 첫번째 자료 제거 - pollFirstEntry(), 마지막 자료 제거 - pollLasatEntry()
		System.out.println("6. 첫번째 자료 꺼내기 : " + treeMap.pollFirstEntry());
		System.out.println("6. 마지막번째 자료 꺼내기 : " + treeMap.pollLastEntry());
		System.out.println("6. 크기 : " + treeMap.size());
		System.out.println("6. toString : " + treeMap);
		System.out.println();
		
		// SortedMap 객체 : 부분 집합 자료 표현
		SortedMap<Integer, String> sortedMap = treeMap.headMap(10);
		System.out.println("7. 10번보다 작은 자료들의 집합 : " + sortedMap);
		
		// Navigable 객체 : 부분 집합 자료 표현
		NavigableMap<Integer, String> navigableMap = treeMap.headMap(10, true);
		System.out.println("7. 10번을 포함한 작은 자료들의 집합 : " + navigableMap);
		
		System.out.println();
		
		// SortedMap 객체 : 부분 집합 자료 표현
		sortedMap = treeMap.tailMap(10);
		System.out.println("8. 10번을 포함한 큰 자료들의 집합 : " + sortedMap);
		
		// Navigable 객체 : 부분 집합 자료 표현
		navigableMap = treeMap.tailMap(10, false);
		System.out.println("8. 10번보다 큰 자료들의 집합 : " + navigableMap);
		System.out.println();
		
		// 정렬
		System.out.println("8. 원본 자료" + treeMap);
		NavigableSet<Integer> navigableSet = treeMap.descendingKeySet();
		System.out.println("8. 정렬 자료 (키값 내림차순) : " + navigableSet);
		System.out.println("8. 앞의 자료를 다시 거꾸로 정렬해서 출력하기 : " + navigableSet.descendingSet());
		System.out.println();

		// 집합 구조로 꺼내기
		navigableMap = treeMap.descendingMap();
		System.out.println("9. 모든 자료를 키값 오름차순 : " + navigableMap);
		System.out.println("9. 앞의 자료를 다시 거꾸로 정렬해서 오름차순 출력하기 : " + navigableMap.descendingMap());
	}
}
