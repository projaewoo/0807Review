
public class ObjectConversion1 {
	public static void main(String[] args) {
//		Bumo bumo;				//선언.
//		bumo = new Bumo("한지민");		//생성자 통한 Bumo의 member변수 초기화.
//		bumo.print();
//		System.out.println(bumo);
//		
//		Jasik jasik = new Jasik("김지민", 24);
//		jasik.print();
//		System.out.println(jasik);
//		
		//다형성
		//선언 : 부모형,  실제 : 자식형
		Bumo bumo = new Jasik("박지민", 28);		//자식 -> 부모 형변환.
		bumo.print();
	//	bumo.display();			//다형성 : 부모는 자식의 재정의된 메소드만 사용가능.
	}
}
