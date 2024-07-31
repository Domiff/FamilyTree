import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person jonathan = new Person("Jonathan", "Joestar", Gender.male,
                LocalDate.of(1868, 2, 22), LocalDate.of(1868, 5, 3));
        Person jonathanMother = new Person("Mari", "Joestar", Gender.female,
                LocalDate.of(1843, 8, 4), LocalDate.of(1868, 9, 23));
        Person jonathanFather = new Person("George", "Joestar", Gender.male,
                LocalDate.of(1840, 2, 22), LocalDate.of(1892, 3, 13));

        System.out.println(jonathan);
        System.out.println(jonathan.setFather(jonathanMother));
        System.out.println(jonathan.setMother(jonathanFather));

        System.out.printf("\n");
        System.out.println("Потомок: ");
        System.out.printf("\n");

        Person george = new Person("George", "Joestar", Gender.male,
                LocalDate.of(1892 , 2, 22), LocalDate.of(1921, 5, 25));
        Person georgeMother = new Person("Erina", "Pendleton", Gender.female,
                LocalDate.of(1869 , 12, 2), LocalDate.of(1950, 7,23));

        System.out.println(george);
        System.out.println(george.setMother(georgeMother));
        System.out.println(george.setFather(jonathan));
        System.out.println(george.setChild(jonathan));

        System.out.printf("\n");
        System.out.println("Потомок: ");
        System.out.printf("\n");

        Person joseph = new Person("Joseph", "Joestar", Gender.male,
                LocalDate.of(1920, 9, 27), LocalDate.of(2011,11, 3));
        Person josephMother = new Person("Elizabeth ", "Joestar", Gender.female,
                LocalDate.of(1888, 12, 22), LocalDate.of(1963, 5, 14));

        System.out.println(joseph);
        System.out.println(joseph.setMother(josephMother));
        System.out.println(joseph.setFather(george));

    }
}