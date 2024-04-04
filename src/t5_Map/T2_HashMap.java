package t5_Map; // 고객 관리

import java.util.*;
import java.util.Map.*;

public class T2_HashMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("성명", "홍길동");
//		map.put("나이", 25); String, String 타입이기 때문에 25(숫자)가 올 수 없다.
		map.put("나이", "25");
		map.put("성별", "남자");
		map.put("주소", "서울");

		System.out.println("1. 크기 : " + map.size());
		System.out.println("1. toString : " + map);
		System.out.println();

		// 검색
		System.out.println("성명 : " + map.get("성명"));
		// 변수를 쓰고 싶다면 아래 나이와 같이 해야함
		String age = "나이";
		System.out.println("나이 : " + map.get(age));
		System.out.println("성별 : " + map.get("성별"));
		System.out.println("주소 : " + map.get("주소"));
		System.out.println();

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(11, "홍길동");
		map2.put(13, "고말숙");
		map2.put(21, "고인돌");
		map2.put(15, "이기자");
		map2.put(17, "강감찬");
		map2.put(19, "오사랑");

		// entrySet()
		// 위 목록의 번호(키)와 성명(값) 출력
		System.out.println("번호\t성명");
		System.out.println("-------------------------");

		for (Entry<Integer, String> en : map2.entrySet()) {
			System.out.print(en.getKey() + "\t" + en.getValue() + "\n");
			// 번호가 키가 되고 성명이 값이 된다
		}
		System.out.println("-------------------------");
		System.out.println();

		// key만 출력 : keySet()
		Set<Integer> key1 = map2.keySet();
		for (Integer k : key1) {
			System.out.println("key : " + k);
		}
		System.out.println();
		
		// key와 값 출력
		Set<Integer> key2 = map2.keySet();
		for (Integer k : key2) {
			System.out.println("key : " + k + " / value : " + map2.get(k));
		}
		System.out.println();
		
		// 값만 출력 : values()
		Collection<String> val = map2.values();
		System.out.println("값 : " + val);
		System.out.println();
		
		System.out.println("key : " + map.keySet());
		System.out.println("values : " + map.values());
		System.out.println();
		
		System.out.println("key : " + map2.keySet());
		System.out.println("values : " + map2.values());
		System.out.println();
		
		//Iterator
		Iterator<Entry<Integer, String>> it = map2.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
