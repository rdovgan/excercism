public class LogLine {

	private final String logLine;

	public LogLine(String logLine) {
		this.logLine = logLine;
	}

	public LogLevel getLogLevel() {
		if (logLine == null) {
			return LogLevel.UNKNOWN;
		}
		int index = logLine.indexOf("]");
		if (index == -1) {
			return LogLevel.UNKNOWN;
		}
		String logName = logLine.substring(1, index);
		return LogLevel.fromName(logName);
	}

	public String getOutputForShortLog() {
		if (logLine == null) {
			return null;
		}
		int index = logLine.indexOf(":");
		if (index == -1) {
			return null;
		}
		return getLogLevel().getLevel() + ":" + logLine.substring(index + 1).trim();
	}
}
