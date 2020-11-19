package hw7;

import java.util.Random;

public class PlaneControl {

	Random rand = new Random();

	int moveUp() {
		return rand.nextInt(1000);
	}

	int moveDown() {
		return rand.nextInt(1000);
	}

	int moveLeft() {
		return rand.nextInt(1000);
	}

	int moveRight() {
		return rand.nextInt(1000);
	}

}
