package mainProject;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.println("1. TV");
			System.out.println("2. �����");
			System.out.println("3. ������");
			System.out.println("4. ����");
			num=scan.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: 
				System.exit(num);
			}
		}
	}
	
}