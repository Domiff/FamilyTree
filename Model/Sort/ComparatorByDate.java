package Sort;

import java.util.Comparator;

import Human.Person;

public class ComparatorByDate implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDateBirth().compareTo(o2.getDateBirth());
    }

}
