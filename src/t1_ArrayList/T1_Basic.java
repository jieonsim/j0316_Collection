package t1_ArrayList;

import java.util.*;

public class T1_Basic {
	public static void main(String[] args) {
//		ArrayList<String> arrayList = new ArrayList<String>(); 뒤 String은 생략 가능
//		ArrayList<String> arrayList = new ArrayList<>(); 용량 capacity() - 기본은 10
//		List<String> arrayList = new ArrayList<>(20); 용량 20으로 설정한 거
//		앞 ArrayList는 Array 생략 가능
//		단 import java.util.*; 하거나 java.util.ArrayList랑 List 두개 다 해주면 됨
		List<String> arrayList = new ArrayList<>();

		System.out.println("1. arrayList 크기 : " + arrayList.size());
		System.out.println("1. toString : " + arrayList.toString());
		System.out.println("1. toString : " + arrayList); // .toString()은 생략 가능, 이미 오버라이딩이 되어있는 거
		System.out.println();

		// 자료 추가(add)
		arrayList.add("100");
		arrayList.add("홍길동");
		arrayList.add("Hong kil dong");
		arrayList.add("홍길동"); // 인덱스로 관리하기 때문에 중복 허용
		arrayList.add("김말숙");
		arrayList.add("이기자");

		System.out.println("2. arrayList 크기 : " + arrayList.size());
		System.out.println("2. toString : " + arrayList); // add한 순대로 순차 출력
		System.out.println();

		// 특정 위치(인덱스)에 자료 추가 .add(인덱스, 자료) 인덱스번지에 추가가 되는거, 기존 인덱스번지에 있던 자료는 하나씩 뒤로 밀려남
		arrayList.add(2, "소나무");

		System.out.println("3. arrayList 크기 : " + arrayList.size());
		System.out.println("3. toString : " + arrayList);
		System.out.println();

		// 검색 : .get(인덱스)
		String name = arrayList.get(2);
		System.out.println("4. name : " + name);
		System.out.println();

		// 변경 : .set(인덱스, 자료)
		arrayList.set(2, "감나무"); // 소나무 > 감나무
		System.out.println("5. arrayList 크기 : " + arrayList.size());
		System.out.println("5. toString : " + arrayList);
		System.out.println();

		// 삭제 : .remove(인덱스) or remove("값")
		arrayList.remove(2);
		arrayList.remove("홍길동"); // 홍길동이 중복으로 있었는데, 삭제 또한 순차대로 되어 앞에 있는 홍길동이 삭제되었음
		System.out.println("6. arrayList 크기 : " + arrayList.size());
		System.out.println("6. toString : " + arrayList);
		System.out.println();

		List<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(0);
		for (int i = 1; i < 5; i++) {
			arrayList2.add(i, (i * 100));
		}
		System.out.println("7. arrayList 크기 : " + arrayList2.size());
		System.out.println("7. toString : " + arrayList2);
		System.out.println();

//		arrayList2.remove(200); Integer는 ()안을 "값"이 아니라 인덱스로 확인함, 200번지가 없기 때문에 오류남. 그래서 객체로 써야함
		arrayList2.remove(new Integer(200)); // 실제 값을 삭제하려면 객체 형식으로 삭제한다. (new 타입(삭제하고자하는 값))
		System.out.println("8. arrayList 크기 : " + arrayList2.size());
		System.out.println("8. toString : " + arrayList2);
		System.out.println();

		// 향상된 for문을 이용한 ArrayList 객체의 활용
		String str = "";
		for (String s : arrayList) {
			str += s + "/";
		}
		str = str.substring(0, str.length() - 1); // 마지막 슬래시 지우기
		System.out.println("9. str : " + str);
		System.out.println();

		// 일반 for문
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(i + "번째 : " + arrayList.get(i));
		}
		System.out.println();

		// 모든 자료 삭제(clear())
		arrayList.clear();
		System.out.println("10. arrayList 크기 : " + arrayList.size());
		System.out.println("10. toString : " + arrayList);
		System.out.println();
		
		ArrayList<String> arrayList3 = new ArrayList<>();
		arrayList3.add("서울");
		arrayList3.add("청주");
		arrayList3.add("부산");
		arrayList3.add("제주");
		System.out.println("11. arrayList 크기 : " + arrayList3.size());
		System.out.println("11. toString : " + arrayList3);
		System.out.println();
		
		// ArrayList 객체의 내용을 모두 추가(합치기) : addAll() 가끔 사용함
		arrayList.addAll(arrayList3);
		System.out.println("12. arrayList 크기 : " + arrayList.size());
		System.out.println("12. toString : " + arrayList);
		System.out.println();
		
		arrayList.addAll(1, arrayList3);
		System.out.println("13. arrayList 크기 : " + arrayList.size());
		System.out.println("13. toString : " + arrayList);
		System.out.println();
		
		arrayList.addAll(arrayList);
		System.out.println("14. arrayList 크기 : " + arrayList.size());
		System.out.println("14. toString : " + arrayList);
		System.out.println();
		
		
	}
}
