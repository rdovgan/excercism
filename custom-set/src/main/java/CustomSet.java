import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

class CustomSet<T> {

	private Set<T> set;

	CustomSet() {
		set = new HashSet<T>();
	}

	CustomSet(Collection<T> data) {
		set = new HashSet<>(data);
	}

	boolean isEmpty() {
		return set.isEmpty();
	}

	boolean contains(T element) {
		return set.contains(element);
	}

	boolean isDisjoint(CustomSet<T> other) {
		return Collections.disjoint(set, other.set);
	}

	boolean add(T element) {
		return set.add(element);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CustomSet) {
			return set.equals(((CustomSet<?>) obj).set);
		}
		return false;
	}

	CustomSet<T> getIntersection(CustomSet<T> other) {
		return new CustomSet<>(set.stream().filter(other::contains).collect(Collectors.toList()));
	}

	CustomSet<T> getUnion(CustomSet<T> other) {
		Set<T> unionSet = new HashSet<>(set);
		unionSet.addAll(other.set);
		return new CustomSet<>(unionSet);
	}

	CustomSet<T> getDifference(CustomSet<T> other) {
		Set<T> differenceSet = new HashSet<>(set);
		differenceSet.removeAll(other.set);
		return new CustomSet<>(differenceSet);
	}

	boolean isSubset(CustomSet<T> other) {
		return set.containsAll(other.set);
	}
}
