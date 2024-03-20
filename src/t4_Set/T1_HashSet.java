package t4_Set;

import java.util.*;
import java.util.stream.*;

/*
	Set 계열 : 집합 자료 구조(Set<E> 인터페이스를 구현한 구현 클래스) HashSet() / TreeSEt()
	인덱스 정보가 없다. 중복을 허용하지 않는다. 비순서구조
	
 */
public class T1_HashSet {
	public static void main(String[] args) {
//		HashSet<String> hashSet = new HashSet<String>();
//		Set<String> hashSet = new HashSet<String>();
		HashSet<String> hashSet = new HashSet<>();

		System.out.println("1. 크기 : " + hashSet.size());
		System.out.println("1. toString : " + hashSet);
		System.out.println();

		// 자료의 추가(add)
		hashSet.add("홍길동");
		hashSet.add("김말숙");
		hashSet.add("이기자");
		hashSet.add("소나무");
		hashSet.add("mbc");

		System.out.println("2. 크기 : " + hashSet.size());
		System.out.println("2. toString : " + hashSet); // 입력 순서와 관계없이 출력된다.
		System.out.println();

		hashSet.add("홍길동"); // 같은 자료를 쓰면 덮어 씌운다
		System.out.println("3. 크기 : " + hashSet.size());
		System.out.println("3. toString : " + hashSet);
		System.out.println();

		hashSet.add(new String("홍길동")); // new로 생성을 해도 같은 걸로 봐서 덮어씌운다.
		// 이 경우 동등비교는 hashcode랑 equals랑 다 같아야함
		System.out.println("4. 크기 : " + hashSet.size());
		System.out.println("4. toString : " + hashSet);
		System.out.println();

		// 자료의 제거(remove)
		hashSet.remove(0); // 인덱스 개념이 없어서 지워지지 않는다. 인덱스가 없기 때문에 특정 위치에 넣을 수도 없음
		System.out.println("5. 크기 : " + hashSet.size());
		System.out.println("5. toString : " + hashSet);
		System.out.println();

		hashSet.remove("홍길동"); // 값을 넣어서 지워아야한다.
		System.out.println("6. 크기 : " + hashSet.size());
		System.out.println("6. toString : " + hashSet);
		System.out.println();

		// 전체 삭제(clear)
		hashSet.clear();
		System.out.println("7. 크기 : " + hashSet.size());
		System.out.println("7. toString : " + hashSet);
		System.out.println();

		// 비어 있는지의 유무(isEmpty)
		System.out.println("8. empty 유무 : " + hashSet.isEmpty());
		System.out.println();

		Set<String> hashSet2 = new HashSet<String>();

		hashSet2.add("가");
		hashSet2.add("나");
		hashSet2.add("다");
		System.out.println("9. 크기 : " + hashSet2.size());
		System.out.println("9. toString : " + hashSet2);
		System.out.println();

		// 포함 유무 : contains()
		System.out.println("10. '나'의 포함 유무 : " + hashSet2.contains("나"));
		System.out.println("10. '라'의 포함 유무 : " + hashSet2.contains("라"));
		System.out.println();

		// 향상된 for문
		for (String s : hashSet2) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		hashSet2.forEach(name -> {
			System.out.println("값 : " + name);
		});
		System.out.println();

		// Iterator
		Iterator<String> it = hashSet2.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n");

		// Stream
		Stream<String> st = hashSet2.stream();
		st.forEach(name -> System.out.print(name + " "));
		System.out.println("\n");
		System.out.println("-------------------------------");

		// 상위 타입(Object)으로 toArray()
		Object[] objects = hashSet2.toArray(); // hashSet을 배열 객체로 바꾼다
		System.out.println("11. " + objects);
		System.out.println("11. objects[0] : " + objects[0]);
		System.out.println();

		// 하위 타입(String)으로 toArray()
		String[] strArray = hashSet2.toArray(new String[0]);
		String str = "";
		for (String s : strArray) {
			str += s + "/";
		}
		str = str.substring(0, str.length() - 1); // 마지막 슬래시 제거
		System.out.println("12. str : " + str);
	}
}
