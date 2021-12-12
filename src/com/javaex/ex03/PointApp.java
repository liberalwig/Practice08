/* 2021.12.12(일)15:22: toString()overrides Object

[문제] com.javaex.ex03 패키지
PointApp.java 실행시 아래와 같이 출력됩니다.
아래와 같이 출력이 되도록 toString()을 재정의 하세요.(main메소드는 수정하지 않습니다.)

*/

package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(3, 3);

		System.out.println(p.toString());

	}

}
