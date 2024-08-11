package Presenter;

import FamilyTree.FamilyTree;
import FileManage.FileHandler;
import Human.Person;

public class Presenter<T> {
    private FamilyTree tree;

    public Presenter() {
        tree = new FamilyTree<T>();
    }

    public void sortByName(FamilyTree tree) {
        tree.sortByName(tree);
    }

    public void sortByDate(FamilyTree tree) {
        tree.sortByDate(tree);
    }

    public void save(FamilyTree<Person> tree) {
        FileHandler fHandler = new FileHandler();
        fHandler.save(tree);
    }

    public FamilyTree<Person> read(FamilyTree<Person> tree) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.read();
        return tree;
    }

}
