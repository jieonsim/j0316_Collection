package t9_exam;

import java.util.ArrayList;
import java.util.Scanner;

/*
	그린중학교 1반에서 3반의 명단이 다음과 같다.
	이때 ArrayList에 각 반 별로 저장시켜놓고,
	ArrayList에 저장된 각 반의 자료를 출력시켜보자.
	또, 반을 입력하면 그 반의 학생들을 출력시켜보시오.
	
	1반 : 홍길동, 김말숙, 이기자
	2반 : 소나무, 대나무, 감나무, 밤나무
	3반 : 오사랑, 하나로, 행복해

 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String[]> classList = new ArrayList<>();

		String[] class1Students = { "홍길동", "김말숙", "이기자" };
		String[] class2Students = { "소나무", "대나무", "감나무", "밤나무" };
		String[] class3Students = { "오사랑", "하나로", "행복해" };

		classList.add(class1Students);
		classList.add(class2Students);
		classList.add(class3Students);

		for (int i = 0; i < classList.size(); i++) {
			
		}
		
		System.out.println("반을 입력해주세요 (1/2/3) : ");
		int classNumber = scanner.nextInt();
//		if
		

	}
}
