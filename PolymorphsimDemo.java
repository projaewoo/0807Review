import java.util.Scanner;

public class PolymorphsimDemo {
	public static void main(String[] args) {
		do {
			int choice = showMenu();
			if(choice == 5) break;
			process(choice);
		}while(true);
	}
	
		static void process(int choice) {
			Mammal bumo = null;		//local변수 초기화 //선언 = 부모형
			switch(choice) {
			case 1 : bumo = new Dog(); break;		//실제 = 자식	//자식이 부모 클래스로 형변환.
			case 2 : bumo = new Cat(); break;
			case 3 :bumo = new Korean(); break;
			case 4 : bumo = new American(); break;
			}
			bumo.saySomething();  		//부모주소.자식의 재정의된 메소드 = 다형성.
		}
		static int showMenu() {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<<<Menu>>>>>>");
			System.out.println("1. Dog");
			System.out.println("2. Cat");
			System.out.println("3. Korean");
			System.out.println("4. American");
			System.out.print("당신은 어떤 종족입니까 ? :");
			int choice = scan.nextInt();
			return choice;
		}
		
	}

