package t1_ArrayList;

import java.util.*;

// List 객체를 배열로 변환 : toArray()
public class T2_toArray {
	public static void main(String[] args) {
		List<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(20);
		vos.add(30);
		vos.add(40);
		vos.add(50);
		System.out.println("1. vos : " + vos); // arrayList는 오버라이딩이 되어있어서 값이 그대로 나오지만
		System.out.println();

		Object[] objects = vos.toArray();
		System.out.println("2. objects : " + objects); // 배열은 이렇게 출력하면 그냥 객체 주소가 나옴
		System.out.println();

		int count = 0;
		for (Object obj : objects) {
			System.out.println("3. obj[" + count + "] : " + obj + ", " + ((Integer) obj + 10));
			count++;
			// obj + 10 이대로 그냥 연산이 되지 않아 Integer로 다운캐스팅 해줌
		}
		System.out.println();

		Integer[] integers = vos.toArray(new Integer[vos.size()]);
		// 리스트를 Integer 타입 변수에 담기 위해 new로 바꾸고자하는 객체를 추가하고 크기는 리스트 size만큼 설정
		count = 0;
		for (Integer ii : integers) {
			System.out.println("4. ii[" + count + "] : " + ii + ", " + (ii + 10));
			count++;
			// 처음에 Integer로 받았기 때문에 (ii+10) 연산에 다운캐스팅 할 필요가 없다.
		}
		System.out.println();
		
		Integer[] integers2 = vos.toArray(new Integer[0]); // 아예 크기를 주지 않을 수도 있다
		count = 0;
		for (Integer ii : integers2) {
			System.out.println("5. ii[" + count + "] : " + ii + ", " + (ii + 10));
			count++;
		}

	}
}
