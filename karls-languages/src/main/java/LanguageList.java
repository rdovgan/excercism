import java.util.ArrayList;
import java.util.List;

public class LanguageList {
	private final List<String> languages = new ArrayList<>();
	private final String java = "Java";
	private final String kotlin = "Kotlin";

	public boolean isEmpty() {
		return languages == null || languages.isEmpty();
	}

	public void addLanguage(String language) {
		languages.add(language);
	}

	public void removeLanguage(String language) {
		languages.remove(language);
	}

	public String firstLanguage() {
		return languages.stream().findFirst().orElse(null);
	}

	public int count() {
		return languages.size();
	}

	public boolean containsLanguage(String language) {
		return languages.contains(language);
	}

	public boolean isExciting() {
		return containsLanguage(java) || containsLanguage(kotlin);
	}
}
