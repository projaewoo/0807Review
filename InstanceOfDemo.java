
public class InstanceOfDemo {
	public static void main(String[] args) {
		Mammal m = new Mammal();			//부모형.
		Korean ko = new Korean();				//자식형.
		
		//"한국인은 포유류이다."		//Korean is a Mammal = Korean extends Mammal.
		m = ko;			//자식 -> 부모 : 자동 형변환	// is a 관계 = extends
		//"포유류는 한국인이다."
		//ko = m;		//오류 
		ko = (Korean)m;	//부모 -> 자식 : 강제 형변환.
									//8행 있으면 컴파일 오류X
										//자식 -> 부모 -> 자식 : 컴파일 오류X
										//개 -> 포유류 -> 고양이 : 불가능.
		Object obj = new Object();		//부모
		String str = new String();		//자식.
		//str = (String)obj;		//Error. 			//부모 -> 자식 : 컴파일 오류.
															//자식 -> 부모 -> 자식 : 컴파일 오류X.
		obj = str;					//자식 -> 부모.
		str = (String)obj;				//부모 -> 자식.		//19행 history가 있어서 컴파일 오류 X
		if(obj instanceof String) System.out.println("형변환 가능");
		else System.out.println("형변환 불가능");
	}
}
