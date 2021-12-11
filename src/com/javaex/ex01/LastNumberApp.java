/*Done/2021.12.10(금), 2021.12.11(토)16:43: ExceptionHandling중 try-catch

[문제] com.javaex.ex01 패키지
LastNumberApp.java 코드 실행시 아래와 같이 예외가 발생합니다.
lastValue() 메소드를 수정해서 아래와 같이 출력되도록 하세요.(main() 메소드는 수정하지 않습니다.)

*/

package com.javaex.ex01;

public class LastNumberApp {

	public static void main(String[] args) {

		// 수정하지 마세요
		lastValue();
	}

	// 런타임시 오류발생
	public static void lastValue() {

		// 아래부분을 try~catch문을 사용하여 수정하세요

		int[] intArray = new int[] { 3, 6, 9 };
		int result;

		try {
			result = intArray[3];
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘었습니다.");
		}

	}

}
