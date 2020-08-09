
public class BoxWeight extends Box {
	private int weight;

	public BoxWeight(int length, int width, int height, int weight) {
		super(length, width, height);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + "BoxWeight [weight=" + weight + "]";
	}			//자식은 부모의 메소드 접근가능.

}
