package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메세지: ");
		message = sc.nextLine();
		
		if(message.equals("")) {
			예외 발생
		}
	}
}
