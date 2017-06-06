package comparators.pingoTheComparator;

import java.util.Comparator;

/**
 * Created by thesinding on 6/6/17.
 */
public class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if(s1.age == s2.age){
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
