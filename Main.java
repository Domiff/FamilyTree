import java.io.IOException;

import java.time.LocalDate;

import FamilyTree.FamilyTree;
import FileManage.FileHandler;
import Human.Gender;
import Human.Person;

public class Main {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
                FamilyTree<Person> tree = viewTree();
                System.out.println("Количество людей в древе: " + tree.getSize());
                System.out.println(tree);

                save(tree);

                // FamilyTree tree3 = read(tree);
                // System.out.println(tree3);

                System.out.println("Отсортированное по имени древо: ");
                tree.sortByName();
                System.out.println(tree);

                System.out.println("Отсортированное по возрасту древо: ");
                tree.sortByDate();
                System.out.println(tree);
        }

        private static FamilyTree<Person> read(FamilyTree<Person> tree) {
                FileHandler fileHandler = new FileHandler();
                fileHandler.read();
                return tree;
        }

        private static void save(FamilyTree<Person> tree) {
                FileHandler fHandler = new FileHandler();
                fHandler.save(tree);
        }

        private static FamilyTree<Person> viewTree() {
                FamilyTree<Person> tree = new FamilyTree<Person>();

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