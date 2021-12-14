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

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scannner(System.in);
    	
    	 
    	
    	
    	
    	sc.close();
    }
}

/*
2021.12.14(화)10:05
네 개의 연산자를 제외한 &같은 게 나오면 =>println알수없는연산
"\q"가 나오면 =>println 종료합니다

네 연산자가 아닌 모든 연산자 등장 경우의 수를 어떻게 제외할 것인가.
if로 한다고 하여도 어떻게 제외시키지.

*/