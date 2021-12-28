package com.greedy.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
		 * 성별 자리 이후부터 *로 가려서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 주민등록번호를 입력하세요 : 900201-2654321
		 * 
		 * -- 출력 예시 --
		 * 900201-2******
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 : ");
		String str = sc.nextLine();

		char crr[] = str.toCharArray();

		for(int i = 0; i < crr.length; i ++) {

			if(i >= 8) {
				crr[i] = '*';
			}

			System.out.print(crr[i]);
		}
	}

}
