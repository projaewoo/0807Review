
public class CarCenter {
	public static void main(String[] args) {
		CarCenter cc = new CarCenter();
		Sonata sonata = new Sonata("Silver Sonata");
		cc.repair(sonata);			//member 메소드는 주소로 접근.
		Carnival carnival = new Carnival("White Carnival");
		cc.repair(carnival);
		Matiz matiz = new Matiz("Red Matiz");
		cc.repair(matiz);
	}						
	
	void repair(Car car) {			//Car의 자식의 참조변수 다 받을 수 있음.	//member method, 다형성, Polymorphic Parameter
		if(car instanceof Matiz) System.out.println("마티즈 수리 완료");
		else if (car instanceof Sonata) System.out.println("소나타 수리 완료.");
		else if (car instanceof Carnival) System.out.println("카니발 수리 완료.");
	}
//	void repair(Carnival carnival) {		//Overload : 메소드 이름 동일, parameter다름.
//		System.out.println(carnival +"이 잘 수리됐습니다.");
//	}
}