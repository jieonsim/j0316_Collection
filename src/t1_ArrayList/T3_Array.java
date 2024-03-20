package t1_ArrayList;

import java.util.*;

import org.omg.CORBA.*;

public class T3_Array {
	public static void main(String[] args) {
		// ArrayList를 배열로 받기
//		ArrayList<Integer[]> vos = new ArrayList<>();
		ArrayList<int[]> vos = new ArrayList<>(); // int로 해도 되나 Integer가 정석

		int[] jum1 = new int[4]; // 번호, 국어, 영어, 수학
		jum1[0] = 1;
		jum1[1] = 100;
		jum1[2] = 90;
		jum1[3] = 80;
		vos.add(jum1); // 배열을 리스트 객체에 담는다

		int[] jum2 = new int[4]; // 번호, 국어, 영어, 수학
		jum2[0] = 2;
		jum2[1] = 90;
		jum2[2] = 80;
		jum2[3] = 70;
		vos.add(jum2);

		int[] jum3 = new int[4]; // 번호, 국어, 영어, 수학
		jum3[0] = 3;
		jum3[1] = 70;
		jum3[2] = 60;
		jum3[3] = 50;
		vos.add(jum3);
		// vos.add(jum);을 이용해 2차원 배열식으로 만들었다

		System.out.println("1. vos의 크기 : " + vos.size());
		System.out.println("1. toString : " + vos); // 배열이 들어간 주소가 나온다.
		System.out.println();

		System.out.println("2. vos 객체 안의 배열값 출력 : ");
		for (int[] voArray : vos) { // 바깥쪽 for문 : 리스트 객체를 출력하기 위함
			for (int v : voArray) { // 안쪽 for문: 각 요소를 꺼내는거
				System.out.print(v + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("3. vos 객체 안의 배열값 출력");
		int[] temp = new int[jum1.length];
		for (int i = 0; i < vos.size(); i++) {
			temp = vos.get(i); // 얕은 복사
			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		System.out.println("4. vos 객체 안의 배열값 출력");
		System.out.print(vos.get(0)[0] + " ");
		System.out.print(vos.get(0)[1] + " ");
		System.out.print(vos.get(0)[2] + " ");
		System.out.print(vos.get(0)[3] + " ");
		System.out.println();
		
		System.out.print(vos.get(1)[0] + " ");
		System.out.print(vos.get(1)[1] + " ");
		System.out.print(vos.get(1)[2] + " ");
		System.out.print(vos.get(1)[3] + " ");
		System.out.println();
		
		System.out.print(vos.get(2)[0] + " ");
		System.out.print(vos.get(2)[1] + " ");
		System.out.print(vos.get(2)[2] + " ");
		System.out.print(vos.get(2)[3] + " ");
		System.out.println("\n");
		
		System.out.println("5. vos 객체 안의 배열값 출력"); // 3,4,5번 모두 같은 값을 출력한다
		for(int i = 0; i < vos.size(); i++) {
			for(int j = 0; j < vos.get(i).length; j++) {
				System.out.print(vos.get(i)[j] + " ");
			}
			System.out.println();
		}
		
	}
}
