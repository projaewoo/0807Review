
public class FinalDemo1 {
	public static void main(String[] args) {
		Sub sub = new Sub();		//상속 : 자식 주소로 접근.
		sub.print();
	}
}

class Super {
	public final void print() {			//final Method : 자식클래스에서 재정의 안되는 메소드. 
		System.out.println("I am parent's Method");
	}
}
class Sub extends Super {
	@Override
	public void print() {			//Error		//부모의 print()가 final메소드여서.
		System.out.println("I am Child Method");
	}
}