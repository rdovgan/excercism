public class Lasagna {

	private static final int EXPECTED_MINUTES_IN_OVEN = 40;
	private static final int MINUTES_TO_PREPARE_ONE_LAYER = 2;

	public int expectedMinutesInOven() {
		return EXPECTED_MINUTES_IN_OVEN;
	}

	public int remainingMinutesInOven(int timePassed) {
		return expectedMinutesInOven() - timePassed;
	}

	public int preparationTimeInMinutes(int layersCount) {
		return MINUTES_TO_PREPARE_ONE_LAYER * layersCount;
	}

	public int totalTimeInMinutes(int layersCount, int timePassed) {
		return timePassed + preparationTimeInMinutes(layersCount);
	}
}
