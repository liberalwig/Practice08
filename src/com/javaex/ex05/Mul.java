/*Undone/2021.12.14(화)10:13-10:25

[문제] com.javaex.ex05 패키지
사칙연산 (+, -, *, /)만 가능하고 2개의 피연산자만 입력 받는 정수 계산기를 만드세요.
각 사칙연산을 수행하는 각 연산 클래스 Add(더하기), Sub(빼기), Mul(곱하기), Div(나누기) 클래스를 만들고 각 클래스는 다음의 필드와 메소드를 가집니다.
	int a
	int b
	void setValue(int a, int b)
	int calculate()

*/
package com.javaex.ex05;

public class Mul {

	private int a;
	private int b;

	public void setValue(int a, int b) {
	}

	public int calculate() {
		return a * b;
	}

}
