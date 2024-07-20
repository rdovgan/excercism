public class ExperimentalRemoteControlCar implements RemoteControlCar {

	private int driveDistance = 20;
	private int distanceTravelled = 0;


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
}
