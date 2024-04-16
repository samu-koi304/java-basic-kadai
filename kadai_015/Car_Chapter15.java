package kadai_015;

public class Car_Chapter15 {
	
	private int gear=0;
	private int speed=0;
	
	public Car_Chapter15(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	public void gearChange(int afterGear) {
		switch(afterGear) {
			case 1 -> this.speed=10;
			case 2 -> this.speed=20;
			case 3 -> this.speed=30;
			case 4 -> this.speed=40;
			case 5 -> this.speed=50;
		default -> this.speed=10;
		}
		this.gear=afterGear;
		System.out.println("ギアが"+gear+"になりました。");
	}
	public void run() {
		System.out.println("時速"+this.speed+"km");
	}
}
