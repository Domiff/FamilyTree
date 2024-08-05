package Iterator;

import java.util.Iterator;
import java.util.List;

import Human.Person;

public class IteratorPerson implements Iterator<Person> {
    private int currentIndex;
    private List<Person> familyTree;

    public IteratorPerson(List<Person> familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < familyTree.size();
    }

    @Override
    public Person next() {
        return familyTree.get(currentIndex++);
    }
}
