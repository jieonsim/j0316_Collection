package t7_comparable_comparator;

import java.util.*;

// 익명 이너 클래스를 사용하여 객체를 비교

class StudentVO4 {
	int age; // 나이
	int classNumber; // 학급

	public StudentVO4(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
}

/*
 * 객체 비교 Comparable() - 인터페이스 : 자기 자신과 매개 변수를 비교한다 compareTo() 메소드를 반드시 구현해야 한다.
 */

public class T1_객체비교4 {
	public static void main(String[] args) {
		// 익명 객체 구현 방법 1.
		StudentVO4 a = new StudentVO4(17, 2);
		StudentVO4 b = new StudentVO4(18, 1);
		
		int res = com2.compare(a, b);
		if (res > 0) {
			System.out.println("a 객체가 b 객체보다 크다.");
		} else if (res == 0) {
			System.out.println("a 객체와 b 객체는 같다.");
		} else {
			System.out.println("a 객체가 b객체보다 작다.");
		}
	}

	// 익명 객체 구현 방법 2.
	public static Comparator<StudentVO4> com2 = new Comparator<StudentVO4>() {

		@Override
		public int compare(StudentVO4 o1, StudentVO4 o2) {
			return o1.classNumber - o2.classNumber;
		}
	};
}
