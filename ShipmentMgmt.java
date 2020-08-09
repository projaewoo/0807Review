
public class ShipmentMgmt extends BoxWeight{
	private int cost;			//member variable

	public ShipmentMgmt(int length, int width, int height, int weight, int cost) {
		super(length, width, height, weight);
		this.cost = cost;
	}
	
	public static void main(String[] args) {
		ShipmentMgmt sm = new ShipmentMgmt(10, 20, 30, 100, 1000);
		System.out.println("길이, 너비, 높이, 무게, 가격");
		System.out.println(sm.toString() + ", cost = " + sm.cost);
	}
	
}
