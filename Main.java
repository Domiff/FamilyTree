public class Main {
    public static void main(String[] args) {
        Person jonathan = new Person("Jonathan", "Joestar", Gender.male);
        Person jonathanMother = new Person("Mari", "Joestar",Gender.female);
        Person jonathanFather = new Person("George", "Joestar", Gender.male);
        
        System.out.println(jonathan);
        System.out.println(jonathan.setFather(jonathanMother));
        System.out.println(jonathan.setMother(jonathanFather));
        
        System.out.printf("\n");
        System.out.println("Потомок: ");
        System.out.printf("\n");
        
        Person george = new Person("George", "Joestar", Gender.male);
        Person georgeMother = new Person("Erina", "Pendleton", Gender.female);

        System.out.println(george);
        System.out.println(george.setMother(georgeMother));
        System.out.println(george.setFather(jonathan));

        System.out.printf("\n");
        System.out.println("Потомок: ");
        System.out.printf("\n");
        
        Person joseph = new Person("Joseph", "Joestar", Gender.male);
        Person josephMother = new Person("Elizabeth ", "Joestar", Gender.female);

        System.out.println(joseph);
        System.out.println(joseph.setMother(josephMother));
        System.out.println(joseph.setFather(george));

    }
}