package hw7;

public abstract class Plane {

	double width = 15;
	double height= 5.97;
	double weight=25087.0953;

	private PlaneControl planeControl = new PlaneControl();

	void up() {
		System.out.println("Plane is moving up: " + planeControl.moveUp());
	}

	void down() {
		System.out.println("Plane is moving down: " + planeControl.moveDown());
	}

	void left() {
		System.out.println("Plane is moving left: " + planeControl.moveLeft());
	}

	void right() {
		System.out.println("Plane is moving right: " + planeControl.moveRight());
	}

	void startEngine() {
		System.out.println("Ready to take off in " + (int) (Math.random() * (89 - 20 + 1) + 20) + " sec");
	}

	void planeTakeoff() {
		System.out.println("Plane is taking off, fuel for " + (Math.random() * (1001 - 0 + 1) + 0));
	}

	void PlaneLand() {
		System.out.println("Plane is landing");
	}

}