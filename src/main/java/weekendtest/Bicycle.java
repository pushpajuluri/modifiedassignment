package weekendtest;

public class Bicycle implements Ibicycle {
	private boolean isMoving;
	public int speed;

	public Bicycle(int speed) {
		isMoving = false;
		this.speed = speed;
	}

	public boolean Bicycle(int speed) {
		if (speed <= 0) {
			isMoving = false;
		} else {
			isMoving = true;

		}
		return isMoving;
	}

	public boolean increaseSpeed() {
		speed++;
		return isMoving = true;
	}

	public boolean decreaseSpeed() {
		speed--;
		return isMoving = false;
	}

	public boolean isMoving() {
		
		return false;
	}

}
