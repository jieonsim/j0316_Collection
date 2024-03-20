package t9_exam;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Lotto 6개의 당첨번호를 중복을 배제해서 오름차순 출력하시오
단, ArrayList 객체 사용
	
*/
public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		while (arrayList.size() < 6) {
			int lottoNumber = ((int) (Math.random() * 45) + 1);
			if (!arrayList.contains(lottoNumber)) {
				arrayList.add(lottoNumber);
			}
		}

		Integer[] lottos = arrayList.toArray(new Integer[0]);
		Arrays.sort(lottos);

		System.out.print("이번 주 로또 당첨 번호(오름차순) : ");
		for (Integer lotto : lottos) {
			System.out.print(lotto + " ");
		}
	}
}
