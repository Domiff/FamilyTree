package Service;

import FamilyTree.FamilyTree;
import Human.Person;

public class Service {
    public Service(FamilyTree<Person> tree) {
        new FamilyTree<Person>();
    }

    public Person addPerson(Person person, FamilyTree<Person> tree) {
        tree.add(person);
        return person;
    }
}
