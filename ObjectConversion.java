/*
* Conversion / Cast
*/
public class ObjectConversion {
	public static void main(String[] args) {
		Object obj = new Object();		//부모.
		String str = new String();		//자식.
		obj = str;			//자동 형변환.  (자식 -> 부모)
		if(obj instanceof String) System.out.println("true");
		else System.out.println("false");
		
		Test test = new Test();		//부모.
		Demo demo = new Demo();		//자식.
		test = (Test)demo;
		if(test instanceof Demo) {
			demo = (Demo)test;			//강제 형변환.
			System.out.println("강제 형변환 완료.");
		}else {
			System.out.println("형변환 안됩니다.");
		}
		
	}
}
class Test{}
class Demo extends Test{}