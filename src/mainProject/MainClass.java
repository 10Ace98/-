package mainProject;

import java.util.Scanner;

import main.co.CoClass;
import main.go.GoClass;
import main.tv.TvClass;


public class MainClass {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num;
		
		TvClass tv= new TvClass();
		CoClass co= new CoClass();
		GoClass go= new GoClass();
		
		while(true) {
			System.out.println("1. TV");
			System.out.println("2. 냉장고");
			System.out.println("3. 에어컨");
			System.out.println("4. 종료");
			num=scan.nextInt();
			switch(num) {
			case 1: 
				tv.tv();
				break;
			case 2: 
				co.co();
				break;
			case 3: 
				go.go();
				break;
			case 4: 
				System.out.println("종료합니다");
				System.exit(num);
			}
		}
	}
	
}