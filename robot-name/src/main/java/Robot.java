import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {

	private String name;

	static class RobotFactory {

		private static Set<String> RESERVED_NAMES = new HashSet<>();

		public static String generateRandomName() {
			Random random = new Random();
			StringBuilder name = new StringBuilder();

			// Generate two random uppercase letters
			for (int i = 0; i < 2; i++) {
				char randomChar = (char) ('A' + random.nextInt(26));
				name.append(randomChar);
			}

			// Generate three random digits
			for (int i = 0; i < 3; i++) {
				int randomDigit = random.nextInt(10);
				name.append(randomDigit);
			}
			if (RESERVED_NAMES.size() == 676000) {
				throw new RuntimeException("Limit of names was reached");
			}
			if (RESERVED_NAMES.contains(name.toString())) {
				return generateRandomName();
			}
			return name.toString();
		}

		public static void addName(String name) {
			RESERVED_NAMES.add(name);
		}

		public static void removeName(String name) {
			RESERVED_NAMES.remove(name);
		}
	}

	public Robot() {
		this.name = RobotFactory.generateRandomName();
		RobotFactory.addName(this.name);
	}

	public String getName() {
		return name;
	}

	public void reset() {
		RobotFactory.removeName(this.name);
		this.name = RobotFactory.generateRandomName();
		RobotFactory.addName(this.name);
	}

}