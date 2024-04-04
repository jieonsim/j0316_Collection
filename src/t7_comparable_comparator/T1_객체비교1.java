package t7_comparable_comparator;

class StudentVO1 {
	int age; 			// 나이
	int classNumber;	// 학급
	
	public StudentVO1(int age) {
		this.age = age;
	}
}

public class T1_객체비교1 {
	public static void main(String[] args) {
		StudentVO1 s1 = new StudentVO1(17); // 17살
		StudentVO1 s2 = new StudentVO1(18); // 18살
		
		// 객체 비교 : 객체끼리의 비교는 불가
//		if(s1 > s2) {
//			System.out.println("s1 객체가 더 크다");
//		} else {
//			System.out.println("s2 객체가 더 크다");
//		}
		
		if(s1.age > s2.age) {
			System.out.println("s1 객체가 더 크다");
		} else {
			System.out.println("s2 객체가 더 크다");
		}
	}
}
