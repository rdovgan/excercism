public class ElonsToyCar {
	private int driven = 0;
	private int battery = 100;

	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}

	public String distanceDisplay() {
		return String.format("Driven %d meters", driven);
	}

	public String batteryDisplay() {
		if (battery <= 0) {
			return "Battery empty";
		}
		return String.format("Battery at %d%%", battery);
	}

	public void drive() {
		if (battery > 0) {
			driven += 20;
			battery -= 1;
		}
	}
}
