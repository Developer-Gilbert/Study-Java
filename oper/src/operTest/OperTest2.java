package operTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		�ɸ� �׽�Ʈ
//		
//		Q. ����� �����ϴ� ���� �����ϼ���.
//		1. ������
//		2. �����
//		3. ������
//		4. ���
//		
//		������ : �Ұ��� �������̰� �������̴�.
//		����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
//		������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
//		��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
		
		String title = " Q.����� �����ϴ� ���� �����ϼ���.";
		String menu = "1. ������/n 2. �����/n 3. ������/n 4. ���/n";
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		
		String redMessage = "�Ұ��� �������̰� �������̴�.";
		String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String whiteMesaage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String errorMessage = "�ٽ� �õ����ּ���";
		String result = null;
		
		System.out.println(title);
		System.out.println(menu);
		
		choice = scan.nextInt();
		
		result = choice == 1? redMessage
					: choice == 2? yellowMessage
							: choice == 3? blackMessage
									: choice == 4? whiteMesaage
											: errorMessage;
		
		System.out.println(result);
		}
}
