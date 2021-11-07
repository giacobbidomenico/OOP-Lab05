package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;

/**
 *
 */
public final class Utilities {

    private Utilities() { 
    	
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
        final Set<X> set = new TreeSet<>(setA);
        set.addAll(setB);
        return set;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        final Set<X> set = new TreeSet<>();
        final var iter = setA.iterator();
        while(iter.hasNext()) {
        	final var app = iter.next();
        	if(setB.contains(app)) {
        		set.add(app);
        	}
        }
        return set;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	final Set<X> set = Utilities.setUnion(setA, setB);
    	set.removeAll(Utilities.setIntersection(setA, setB));
    	return set;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	int random =  new Random().nextInt(coll.size());
    	final var iter = coll.iterator();
    	while(iter.hasNext()) {
    		if(random == 0) {
    			return iter.next();
    		}
    		random--;
    		iter.next();
    	}
    	return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        return new Pair<X,Y>(Utilities.getRandomElement(first), 
        		Utilities.getRandomElement(second));
    }
}