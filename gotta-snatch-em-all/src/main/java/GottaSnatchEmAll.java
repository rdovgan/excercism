import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

	static Set<String> newCollection(List<String> cards) {
		return new HashSet<>(cards);
	}

	static boolean addCard(String card, Set<String> collection) {
		return collection.add(card);
	}

	static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
		if (myCollection == null || theirCollection == null || myCollection.isEmpty() || theirCollection.isEmpty()) {
			return false;
		}
		return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
	}

	static Set<String> commonCards(List<Set<String>> collections) {
		if (collections == null || collections.isEmpty()) {
			return Collections.emptySet();
		}

		Set<String> commonElements = new HashSet<>(collections.get(0));
		collections.forEach(commonElements::retainAll);
		return commonElements;
	}

	static Set<String> allCards(List<Set<String>> collections) {
		Set<String> allCards = new HashSet<>(collections.get(0));
		collections.forEach(allCards::addAll);
		return allCards;
	}
}
