import java.io.IOException;

import java.time.LocalDate;

import FamilyTree.FamilyTree;
import Human.Gender;
import Human.Person;
import Presenter.Presenter;
import Service.Service;
import View.View;

public class Main {
        public static void main(String[] args) throws IOException, ClassNotFoundException {
                FamilyTree<Person> tree = new FamilyTree<Person>();
                Presenter<Person> presenter = new Presenter<Person>();

                Service service = new Service(tree);

                service.addPerson(new Person("George", "Joestar", Gender.male,
                                LocalDate.of(1840, 2, 22)), tree);
                service.addPerson(new Person("Jonathan", "Joestar", Gender.male,
                                LocalDate.of(1868, 2, 22)), tree);
                service.addPerson(new Person("George", "Joestar", Gender.male,
                                LocalDate.of(1892, 2, 22)), tree);
                service.addPerson(new Person("Joseph", "Joestar", Gender.male,
                                LocalDate.of(1920, 9, 27)), tree);
                service.addPerson(new Person("Holly", "Kujo", Gender.female,
                                LocalDate.of(1943, 9, 30)), tree);
                service.addPerson(new Person("Jotaro", "Kujo", Gender.male,
                                LocalDate.of(1970, 1, 7)), tree);
                service.addPerson(new Person("Jolyn", "Kujo", Gender.female,
                                LocalDate.of(1992, 11, 5)), tree);

                System.out.println("1. Просмотр древа");
                System.out.println("2. Сортировка по имени");
                System.out.println("3. Сортировка по возрасту");
                System.out.println("4. Сохранить древо");

                View view = new View();
                int number = view.getAnswer();
                switch (number) {
                        case 1:
                                System.out.println(tree);
                                break;
                        case 2:
                                presenter.sortByName(tree);
                                System.out.println(tree);
                                break;
                        case 3:
                                presenter.sortByDate(tree);
                                System.out.println(tree);
                                break;
                        case 4:
                                presenter.save(tree);
                                System.out.println("Древо сохранено");
                                break;
                        default:
                                System.out.println("Введена неверная команда");
                                break;
                }

        }

}
