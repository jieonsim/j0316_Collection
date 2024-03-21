package t9_exam;

import java.util.*;

public class Test1Run {
	public static void main(String[] args) {
		ArrayList<Test1VO> vos = new ArrayList<>(); // .sort 불가 , Test1VO에는 여러 타입의 값이 있기 때문
		
		Test1VO vo = null; // 선언
		
		vo = new Test1VO(); // 생성
		vo.setName("홍길동");
		vo.setAge(20);
		vo.setGender("남자");
		vo.setAddress("서울");
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("김말숙");
		vo.setAge(29);
		vo.setGender("여자");
		vo.setAddress("청주");
		vos.add(vo);
		
		vo = new Test1VO();
		vo.setName("이기자");
		vo.setAge(33);
		vo.setGender("남자");
		vo.setAddress("제주");
		vos.add(vo);
		
		
		for (Test1VO v : vos) {
			System.out.println(v);
			// 선언 및 각각 생성하지 않으면 가장 마지막에 넣은 이기자 정보만 세개 출력되게 된다.
		}
	}
}
