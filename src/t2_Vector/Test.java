package t2_Vector;

import java.util.*;

/*
	Vector : List 계열, List 자료구조의 특징을 모두 갖는다.
	인덱스로 관리, 순차처리, 앞에서부터 기억, 자료의 삽입 / 삭제 시 많은 시간이 소요, 중복 허용
	
	멀티스레드의 동기화(synchronized) 작업에 유리, ArrayList에 비해서 안전(안정)적임
	
	capacity()는 List 객체일 때는 사용 불가, Vector로 해야함
	
 */
public class Test {
	public static void main(String[] args) {
//		Vector<String> vector = new Vector<String>(); 뒤 String 생략 가능 
//		List<String> vector = new Vector<>(); 앞 Vector 대신 List로 대체 가능
		Vector<String> vector = new Vector<>();

		System.out.println("1. vector 용량 : " + vector.capacity());
		System.out.println("1. vector 크기 : " + vector.size());
		System.out.println("1. toString : " + vector);
		System.out.println();

		vector.add("홍길동");
		vector.add("김말숙");
		vector.add("이기자");
		vector.add("오하늘");
		vector.add("소나무");
		vector.add("김연아");
		vector.add("손흥민");
		vector.add("이길자");
		vector.add("고인돌");

		System.out.println("2. vector 용량 : " + vector.capacity());
		System.out.println("2. vector 크기 : " + vector.size());
		System.out.println("2. toString : " + vector);
		System.out.println();

		vector.add("홍길동");
		vector.add("김말숙");

		System.out.println("3. vector 용량 : " + vector.capacity());
		System.out.println("3. vector 크기 : " + vector.size());
		System.out.println("3. toString : " + vector);
		System.out.println();

		vector.add(1, "대나무");
		System.out.println("4. vector 용량 : " + vector.capacity());
		System.out.println("4. vector 크기 : " + vector.size());
		System.out.println("4. toString : " + vector);
		System.out.println();
		
		vector.remove(1);
		vector.remove(2);
		vector.remove("홍길동");
		System.out.println("5. vector 용량 : " + vector.capacity());
		System.out.println("5. vector 크기 : " + vector.size());
		System.out.println("5. toString : " + vector);
		System.out.println();
		
		vector.set(1, "안녕");
		System.out.println("6. vector 용량 : " + vector.capacity());
		System.out.println("6. vector 크기 : " + vector.size());
		System.out.println("6. toString : " + vector);
		System.out.println();
		
		vector.clear();
		System.out.println("7. vector 용량 : " + vector.capacity());
		System.out.println("7. vector 크기 : " + vector.size());
		System.out.println("7. toString : " + vector);
		System.out.println();
		
		System.out.println("8. isEmpty() : " + vector.isEmpty());
		
		
	}
}
