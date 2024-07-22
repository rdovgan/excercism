import java.util.Random;

class CaptainsLog {

	private static final char[] PLANET_CLASSES = new char[] { 'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y' };

	private Random random;

	CaptainsLog(Random random) {
		this.random = random;
	}

	char randomPlanetClass() {
		int randomIndex = random.nextInt(PLANET_CLASSES.length);
		return PLANET_CLASSES[randomIndex];
	}

	String randomShipRegistryNumber() {
		return String.format("NCC-%d", random.nextInt(1000, 10000));
	}

	double randomStardate() {
		return random.nextDouble(41000.0, 42000.0);
	}
}
