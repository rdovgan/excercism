public class CarsAssemble {

	private static final int PRODUCTION_SPEED = 221;


	public double productionRatePerHour(int speed) {
		return PRODUCTION_SPEED * defineSuccessRate(speed) * speed;
	}

	private double defineSuccessRate(int speed) {
		if (speed == 0) {
			return 0.;
		}
		if (speed >= 1 && speed <= 4) {
			return 1.;
		}
		if (speed <= 8) {
			return .9;
		}
		if (speed == 9) {
			return .8;
		}
		return .77;
	}

	public int workingItemsPerMinute(int speed) {
		return (int) (productionRatePerHour(speed) / 60);
	}
}
