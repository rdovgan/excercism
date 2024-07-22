class Badge {
	public String print(Integer id, String name, String department) {
		String badge = (id != null) ? "[" + id + "] - " : "";
		department = (department != null) ? department : "OWNER";
		return String.format("%s%s - %s", badge, name, department.toUpperCase());
	}
}
