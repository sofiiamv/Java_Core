package hw7;

public class Su_27 extends Plane implements Special {

	int maxSpeed;
	String color;

	public Su_27(int maxSpeed, String color) {
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void turboSpeedup() {
		System.out.println("turboSpeed is " + (Math.random() * (int)((maxSpeed + 1000) - maxSpeed + 1) + maxSpeed));
	}

	@Override
	public void stels() {
		System.out.println("Su_27 is invisible for " + (Math.random() * (60 - 1 - 1) + 1));

	}

	@Override
	public void nuclearAttack() {
		System.out.println("Number of nuclear weapons: " + (int) (Math.random() * (10 - 1 - 1) + 1));
	}

}
