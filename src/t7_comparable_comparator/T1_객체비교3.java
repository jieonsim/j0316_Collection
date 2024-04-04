package t7_comparable_comparator;

import java.util.*;

// 익명 이너 클래스를 사용하여 객체를 비교

class StudentVO3 {
	int age; 			// 나이
	int classNumber;	// 학급
	
	public StudentVO3(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}
}

/* 객체 비교
	Comparable() - 인터페이스 : 자기 자신과 매개 변수를 비교한다
	compareTo() 메소드를 반드시 구현해야 한다.
 */

public class T1_객체비교3 {
	public static void main(String[] args) {
		// 익명 객체 구현 방법 1.
		
		Comparator<StudentVO3> comp1 = new Comparator<StudentVO3>() {
			
			@Override
			public int compare(StudentVO3 o1, StudentVO3 o2) {
				return o1.classNumber - o2.classNumber;
			}
		};
	}
	// 익명 객체 구현 방법 2.
	public static Comparator<StudentVO3> com2 = new Comparator<StudentVO3>() {
		
		@Override
		public int compare(StudentVO3 o1, StudentVO3 o2) {
			return o1.classNumber - o2.classNumber;
		}
	};
}
