package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0, lastNumber = 0;
		String message = "���� �� ���� �Է��ϼ���", result = null;
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		result = firstNumber > lastNumber ? "ū ��: " + firstNumber 
				: firstNumber == lastNumber ? "�� ���� �����ϴ�" : "ū ��: " + lastNumber;
		
		System.out.println(result);
	}
}














