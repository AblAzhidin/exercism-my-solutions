import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> result = new HashSet<>();
        for (String card : cards) {
            result.add(card);
        }

        return result;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean r1 = false, r2 = false;
        for (String str : myCollection) {
            if (!theirCollection.contains(str)) {
                r1 = true;
                break;
            }
        }

        for (String str : theirCollection) {
            if (!myCollection.contains(str)) {
                r2 = true;
                break;
            }
        }

        return r1 && r2;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>();

        if (collections.isEmpty()) {
            return result;
        }

        for (String str : collections.get(0)) {
            boolean allHave = true;
            for (Set<String> set : collections) {
                if (!set.contains(str)) {
                    allHave = false;
                }
            }

            if (allHave) {
                result.add(str);
            }
        }

        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<>();
        for (Set<String> set : collections) {
            result.addAll(set);
        }

        return result;
    }
}
