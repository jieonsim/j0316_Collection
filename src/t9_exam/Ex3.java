package t9_exam;

import java.util.TreeSet;

/* 
Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오
단, set 계열 객체 사용
*/

public class Ex3 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		while (treeSet.size() < 6) {
			treeSet.add((int) (Math.random() * 45) + 1);
		}

		Integer[] lottoNumbers = treeSet.toArray(new Integer[0]);

		System.out.print("이번 주 로또 당첨 번호(오름차순) : ");
		for (Integer lotto : lottoNumbers) {
			System.out.print(lotto + " ");
		}
	}
}
