package t7_comparable_comparator;

class StudentVO2 implements Comparable<StudentVO2>{
	int age; 			// 나이
	int classNumber;	// 학급
	
	public StudentVO2(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compareTo(StudentVO2 o) {
		if(this.age > o.age) {
			return 1;
		} else if (this.age == o.age) {
			return 0;
		} else {
			return -1;
		}
		
		// return this.age - o.age
	}
}

/* 객체 비교
	Comparable() - 인터페이스 : 자기 자신과 매개 변수를 비교한다
	compareTo() 메소드를 반드시 구현해야 한다.
 */

public class T1_객체비교2 {
	public static void main(String[] args) {
		StudentVO2 a = new StudentVO2(17, 2); // 17살 2반
		StudentVO2 b = new StudentVO2(18, 1); // 18살 1반
		
		int res = a.compareTo(b);
		
		if (res > 0) {
			System.out.println("a 객체가 b 객체보다 크다.");
		} else if (res == 0) {
			System.out.println("a 객체와 b 객체는 같다.");
		} else {
			System.out.println("a 객체가 b객체보다 작다.");
		}
	}
}
