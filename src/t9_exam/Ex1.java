package t9_exam;

import java.util.ArrayList;
import java.util.Arrays;

// max, min / sort / search / merge / 통계(누적)

/*
- 정렬(sort) 문제
10개의 난수(10 ~ 100)를 발생시켜서 ArrayList 객체에 저장시킨 후
원본 / 오름차순 정렬 / 내림차순 정렬 자료를 출력하시오.
(ArrayList 객체를 이용하시오)
*/
public class Ex1 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			arrayList.add((int) (Math.random() * 91) + 10);
		}

		Integer[] intgers = arrayList.toArray(new Integer[0]);

		System.out.print("10부터 100까지의 난수 중 10개 원본 :\t\t");
		for (Integer integer : intgers) {
			System.out.print(integer + " ");
		}
		System.out.println();

		System.out.print("10부터 100까지의 난수 중 10개 오름차순 :\t");
		Arrays.sort(intgers);
		for (Integer integer : intgers) {
			System.out.print(integer + " ");
		}
		System.out.println();

		System.out.print("10부터 100까지의 난수 중 10개 내림차순 :\t");
		for (int i = intgers.length - 1; i >= 0; i--) {
			System.out.print(intgers[i] + " ");
		}
		System.out.println();
	}
}
