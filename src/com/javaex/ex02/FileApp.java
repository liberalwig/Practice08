/*2021.12.11(토)16:46, 2021.12.12(일)15:20 ExceptionHandling중 difference of positioning throws

[문제] com.javaex.ex02 패키지
FileApp.java 코드 main() 메소드 실행시 아래와 같이 예외가 발생합니다.
아래와 같이 출력이 되도록 fileRead() 부분에 예외처리를 하세요
 
*/

package com.javaex.ex02;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {

		// try~catch문을 사용하여 에러를 수정하세요
		try {
			fileRead();
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");

		}

	}

	// 수정하지 마세요
	public static void fileRead() throws IOException {
		throw new IOException(); // 강제로 예외 발생
	}
}
