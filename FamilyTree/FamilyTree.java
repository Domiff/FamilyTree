package FamilyTree;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import Human.Person;

public class FamilyTree implements Serializable {
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
}
