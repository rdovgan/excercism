import java.util.Comparator;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

	private int driveDistance = 10;
	private int distanceTravelled = 0;
	private int numbersOfVictories = 0;

	@Override
	public void drive() {
		distanceTravelled += driveDistance;
	}

	@Override
	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	@Override
	public int getDriveDistance() {
		return driveDistance;
	}

	public int getNumberOfVictories() {
		return numbersOfVictories;
	}

	public void setNumberOfVictories(int numberOfVictories) {
		this.numbersOfVictories = numberOfVictories;
	}

	@Override
	public int compareTo(ProductionRemoteControlCar o) {
		return Integer.compare(numbersOfVictories, o.getNumberOfVictories());
	}
}
