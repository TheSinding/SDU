package comparators.pingoTheComparator;

import java.util.Comparator;

/**
 * Created by thesinding on 6/6/17.
 */
public class NameComparator implements Comparator {
    public int compare(Object o1, Object o2){
        return ((Student) o1).name.compareTo(((Student) o2).name);
    }
}
