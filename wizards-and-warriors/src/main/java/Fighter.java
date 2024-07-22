class Fighter {

	boolean isVulnerable() {
		return true;
	}

	int getDamagePoints(Fighter fighter) {
		return 1;
	}
}

class Warrior extends Fighter {

	@Override
	boolean isVulnerable() {
		return false;
	}

	int getDamagePoints(Fighter fighter) {
		if (fighter.isVulnerable()) {
			return 10;
		}
		return 6;
	}

	@Override
	public String toString() {
		return "Fighter is a Warrior";
	}
}

class Wizard extends Fighter {

	private boolean prepared = false;

	public void prepareSpell() {
		prepared = true;
	}

	int getDamagePoints(Fighter fighter) {
		if (prepared) {
			return 12;
		}
		return 3;
	}

	@Override
	boolean isVulnerable() {
		return !prepared;
	}

	@Override
	public String toString() {
		return "Fighter is a Wizard";
	}
}
