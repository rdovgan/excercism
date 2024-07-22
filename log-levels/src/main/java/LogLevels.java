public class LogLevels {

	public static String message(String logLine) {
		if (logLine == null) {
			return null;
		}
		return logLine.replaceAll("\\[(ERROR|INFO|WARNING)\\]:", "").trim();
	}

	public static String logLevel(String logLine) {
		if (logLine == null) {
			return null;
		}
		int index = logLine.indexOf("]");
		if (index == -1) {
			return null;
		}
		return logLine.substring(1, index).toLowerCase();
	}

	public static String reformat(String logLine) {
		return String.format("%s (%s)", message(logLine), logLevel(logLine));
	}
}
