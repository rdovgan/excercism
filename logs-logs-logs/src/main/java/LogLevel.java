import java.util.Arrays;

public enum LogLevel {

	UNKNOWN(0, "UNW"), TRACE(1, "TRC"), DEBUG(2, "DBG"), INFO(4, "INF"), WARNING(5, "WRN"),
	ERROR(6, "ERR"), FATAL(42, "FTL");

	private final int level;
	private final String name;

	LogLevel(int level, String name) {
		this.level = level;
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public static LogLevel fromName(String name) {
		return Arrays.stream(values()).filter(logLevel -> logLevel.getName().equals(name.toUpperCase())).findFirst().orElse(UNKNOWN);
	}
}
