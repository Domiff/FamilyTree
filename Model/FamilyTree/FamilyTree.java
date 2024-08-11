package FamilyTree;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Human.Person;
import Iterator.IteratorPerson;
import Sort.ComparatorByDate;
import Sort.ComparatorByName;

public class FamilyTree<T> implements Serializable, Iterable<Person> {
    List<Person> family;

    public FamilyTree() {
        this(new LinkedList<>());
    }

    public FamilyTree(List<Person> family) {
        this.family = family;
    }

    public boolean add(Person person) {
        if (person == null) {
            return false;
        }
        if (!family.contains(person)) {
            family.add(person);
            return true;
        }
        return false;
    }

    public int getSize() {
        return family.size();
    }

    public void sortByName(FamilyTree tree) {
        family.sort(new ComparatorByName());
    }

    public void sortByDate(FamilyTree tree) {
        family.sort(new ComparatorByDate());
    }

    @Override
    public String toString() {
        try {
            System.out.println(" ");
            for (int i = 0; i < family.size(); ++i) {
                System.out.println("Родитель " + family.get(i));
                System.out.println(family.get(i).setChild(family.get(i + 1)));
                System.out.println(' ');
            }
        } catch (IndexOutOfBoundsException e) {
            return " ";
        }
        return " ";
    }

    @Override
    public Iterator<Person> iterator() {
        return new IteratorPerson(family);
    }
}
