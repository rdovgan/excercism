import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SqueakyClean {

	private static final Map<Character, Character> LEET_MAP = Map.of(
			'4', 'a',
			'3', 'e',
			'0', 'o',
			'1', 'l',
			'7', 't'
	);

	static String clean(String input) {
		// Step 1: Convert leetspeak to normal text
		String leetConverted = input.chars()
				.mapToObj(c -> (char) c)
				.map(c -> LEET_MAP.getOrDefault(c, c))
				.map(String::valueOf)
				.collect(Collectors.joining());

		// Step 2: Convert kebab-case to camelCase
		String[] parts = leetConverted.split("-");
		String camelCaseConverted = parts[0] +
				Stream.of(parts)
						.skip(1)
						.map(part -> part.substring(0, 1).toUpperCase() + part.substring(1))
						.collect(Collectors.joining());

		// Step 3: Omit characters that are not letters
		String result = camelCaseConverted.chars()
				.filter(character -> Character.isLetter(character) || Character.isSpaceChar(character))
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

		return result.replace(' ', '_');
	}
}
