import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

import FamilyTree.FamilyTree;
import Human.Gender;
import Human.Person;

public class Main {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
                FamilyTree tree = viewTree();
                System.out.println("Количество людей в древе: " + 7);
                System.out.println(tree);

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                                new FileOutputStream("person.txt"));
                objectOutputStream.writeObject(tree);
                objectOutputStream.close();

                System.out.println("Десериализация объекта: \n");

                ObjectInputStream objectInputStream = new ObjectInputStream(
                                new FileInputStream("person.txt"));
                FamilyTree treeRestored = (FamilyTree) objectInputStream.readObject();
                objectInputStream.close();

                System.out.println(treeRestored);
        }

        private static FamilyTree viewTree() {
                FamilyTree tree = new FamilyTree();

                Person jonathanFather = new Person("George", "Joestar", Gender.male,
                                LocalDate.of(1840, 2, 22));
                Person jonathan = new Person("Jonathan", "Joestar", Gender.male,
                                LocalDate.of(1868, 2, 22));

                tree.add(jonathanFather);
                tree.add(jonathan);

                Person georgeFather = jonathan;
                Person george = new Person("George", "Joestar", Gender.male,
                                LocalDate.of(1892, 2, 22));

                tree.add(georgeFather);
                tree.add(george);

                Person josephFather = george;
                Person joseph = new Person("Joseph", "Joestar", Gender.male,
                                LocalDate.of(1920, 9, 27));

                tree.add(josephFather);
                tree.add(joseph);

                Person hollyFather = joseph;
                Person holly = new Person("Holly", "Kujo", Gender.female,
                                LocalDate.of(1943, 9, 30));

                tree.add(hollyFather);
                tree.add(holly);

                Person jotaroMother = holly;
                Person jotaro = new Person("Jotaro", "Kujo", Gender.male,
                                LocalDate.of(1970, 1, 7));

                tree.add(jotaroMother);
                tree.add(jotaro);

                Person jolynfather = jotaro;
                Person jolyn = new Person("Jolyn", "Kujo", Gender.female,
                                LocalDate.of(1992, 11, 5));

                tree.add(jolynfather);
                tree.add(jolyn);

                return tree;
        }
}