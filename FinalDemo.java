
public class FinalDemo {
	int age;			//member변수
	final double PI;		//member상수
	static int kor;			//class변수.	(static변수).
	static final int ENG;		//class상수 (static상수)
	
	static {			//static 초기화 블록.
		kor = 90;				//class변수 초기화 방법.
		ENG = 100;			//class상수 초기화 방법.
	}
	
	public FinalDemo() {		//생성자.
		this.age = 24;			//member변수 초기화.
		this.PI = 3.14;			//member상수 초기화.
	}
	
	public static void main(String[] args) {
		final String NAME = "한지민";				//local상수.
		//NAME = "김지민";		//Error. 	//상수는 변경불가.
	}
}
