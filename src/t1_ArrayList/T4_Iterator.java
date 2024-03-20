package t1_ArrayList;

import java.util.*;
import java.util.stream.*;

public class T4_Iterator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> vos = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			vos.add((int) (Math.random() * 100) + 1);
		}
		System.out.println("1. vos : " + vos);
		System.out.println();

		// 향상된 for 문 = for ~ each문
		for (int vo : vos) {
			System.out.print(vo + " ");
		}
		System.out.println("\n");

		// 수를 입력받아 vos에 들어있으면 '당첨' 그렇지 않으면 '다음 기회에'를 출력하시오
//		System.out.print("수를 입력하세요 : ");
//		int number = scanner.nextInt();
//		
//		if (vos.contains(number)) {
//			System.out.println("당첨");
//		} else {
//			System.out.println("다음 기회에");
//		}


		int count = 0;
		System.out.print("찾고자 하는 수를 입력하세요 : ");
		int su = scanner.nextInt();
		for (int i = 0; i < vos.size(); i++) {
			// if(vos.get(i) == su) {		// 이 방법도 되고 아래도 된다. 그치만 Integer니까 equals를 쓰는게 낫다
			if (vos.get(i).equals(su)) {
				System.out.println("당첨");
				break;
			}
			count++;
		}
		if (vos.size() == count) {
			System.out.println("다음 기회에");
		}
		System.out.println("작업 끝");
		System.out.println();
		
		scanner.close();
		
		// Iterator (반복 지시자)로 vos객체를 꺼내기
		Iterator<Integer> it = vos.iterator();
		System.out.println("2. it : " + it);
		while(it.hasNext()) { // hasNext(), hasMoreElement() : 안에 자료가 있는지 확인
			int item = it.next(); // hasNext()
			System.out.print(item + " ");
		}
		System.out.println("\n");
		
		// 향상된 for문은 iterator나 stream에는 사용 불가
		
		// 스트림(Stream) 객체로 출력하기
		Stream<Integer> stream = vos.stream();
		stream.forEach(no -> System.out.print(no + " ")); // 함수적 코딩 기법(람다식)
		
	}
}
