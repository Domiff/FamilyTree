import java.time.LocalDate;

import FamilyTree.FamilyTree;
import Human.Gender;
import Human.Person;

public class Main {
        public static void main(String[] args) {
                FamilyTree tree = viewTree();
                System.out.println(tree);

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

                return tree;
        }
}