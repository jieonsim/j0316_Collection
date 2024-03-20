package t5_Map;

import java.util.*;

/*
	Map 계열 자료 구조 : 사전식 자료 구조, Web에서의 JSON형식과 같다.
	순서와 관계없다. 즉, '키'와 '값'으로 구성된 자료구조로 '키'가 중요한 역할을 한다.
	
	중복 => '키'는 중복 불가, '값'은 중복 허용
	
 */
public class t1_Basic {
	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, String> map = new HashMap<>();

		System.out.println("1. 크기 : " + map.size());
		System.out.println("1. toString : " + map); // map 계열은 {} 중괄호로 나옴

		// 자료의 삽입(추가) : put(K(키), V(값))
		map.put(11, "홍길동");
		map.put(13, "고말숙");
		map.put(21, "고인돌");
		map.put(15, "이기자");
		map.put(17, "강감찬");
		map.put(19, "오사랑");

		System.out.println("2. 크기 : " + map.size());
		System.out.println("2. toString : " + map);
		System.out.println();
		
		map.put(12, "소나무");
		System.out.println("3. 크기 : " + map.size());
		System.out.println("3. toString : " + map);
		System.out.println();
		
		map.put(12, "대나무"); // 키는 중복되지 않아 소나무가 없어짐
		System.out.println("4. 크기 : " + map.size());
		System.out.println("4. toString : " + map);
		System.out.println();
		
		map.put(16, "대나무"); // 키는 중복되지 않지만 값은 중복될 수 있다.
		System.out.println("5. 크기 : " + map.size());
		System.out.println("5. toString : " + map);
		System.out.println();
		
		// 검색 : get(키)
		String name = map.get(11);
		System.out.println("6. map.get(11) : " + name);
		System.out.println();
		System.out.println();
		
		name = map.get(100); // 없는 자료 검색, 다만 null로 출력된다.
		System.out.println("7. map.get(100) : " + name);
		System.out.println();
		System.out.println();
		
		// 수정 : put(키, 값)
		map.put(11, "홍길순"); // 홍길동이 사라지고 그 자리에 홍길순이 들어간다
		System.out.println("8. 크기 : " + map.size());
		System.out.println("8. toString : " + map);
		System.out.println();
		
		// 삭제 : remove(키)
		map.remove(11);
		System.out.println("9. 크기 : " + map.size());
		System.out.println("9. toString : " + map);
		System.out.println();
		
		// 모든 자료 삭제 : clear
		map.clear();
		System.out.println("10. 크기 : " + map.size());
		System.out.println("10. toString : " + map);
		System.out.println();
		
		
		
		
		

	}
}
