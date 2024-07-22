class NeedForSpeed {

	private int speed;
	private int battery;
	private int batteryDrain;
	private int driven;

	NeedForSpeed(int speed, int batteryDrain) {
		this.speed = speed;
		this.batteryDrain = batteryDrain;
		this.battery = 100;
		this.driven = 0;
	}

	public boolean batteryDrained() {
		return battery == 0 || battery < batteryDrain;
	}

	public int distanceDriven() {
		return driven;
	}

	public void drive() {
		if (!batteryDrained()) {
			driven += speed;
			battery -= batteryDrain;
		}
	}

	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}

	public int getBattery() {
		return battery;
	}

	public int getSpeed() {
		return speed;
	}

	public int getBatteryDrain() {
		return batteryDrain;
	}
}

class RaceTrack {

	private int distance;

	RaceTrack(int distance) {
		this.distance = distance;
	}

	public boolean canFinishRace(NeedForSpeed car) {
		return car.distanceDriven() + (car.getBattery() / car.getBatteryDrain() * car.getSpeed()) >= distance;
	}
}
