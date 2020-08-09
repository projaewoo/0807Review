
public class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}
	@Override					//Car의 부모클래스는 Object //Object의 toString()은 해쉬코드 출력.
	public String toString() {					//따라서 이름만 출력하려면 Override 필요.
		return this.name;
	}
	
}
