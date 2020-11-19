package hw7;

public class Main {

	public static void main(String[] args) {

		Su_27 su_27 = new Su_27(2500, "pink");

		su_27.startEngine();
		su_27.planeTakeoff();

		su_27.up();
		su_27.right();
		su_27.left();
		su_27.down();

		su_27.stels();
		su_27.nuclearAttack();
		su_27.turboSpeedup();

		su_27.PlaneLand();

	}

}
