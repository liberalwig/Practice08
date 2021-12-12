/*Done/ 2021.12.12(일)15:22: toString()overrides Object

[문제] com.javaex.ex03 패키지
PointApp.java 실행시 아래와 같이 출력됩니다.
아래와 같이 출력이 되도록 toString()을 재정의 하세요.(main메소드는 수정하지 않습니다.)

*/

package com.javaex.ex03;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// toString()을 작성 하세요
	@Override
	public String toString() {
		return "[포인트] x:" + x + ", y:" + y + "입니다.";
	}

}

//단지 자동toString()생성 하니 문제가 풀림