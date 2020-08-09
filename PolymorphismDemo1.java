
public class PolymorphismDemo1 {
	public static void main(String[] args) {
		//Sonata [] array = new Sonata[2];
		//Heterogeneous Collction
//		Car [] array = new Car[3];
//		array[0] = new Sonata("Black Sonata");
//		array[1] = new Matiz("Silver Matiz");
//		array[2] = new Carnival("White Carnival");
		
		//각 자식클래스는 부모의 배열로 묶을 수 있음
		Car [] array = {new Sonata("Black Sonata"),
								new Matiz("Silver Matiz"),
								new Carnival("White Carnival")
								};
		for(Car car : array) System.out.println(car);		//자식은 부모의 toString() 접근가능.
		
	}			
}