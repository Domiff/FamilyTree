import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Person mother;
    private Person father;
    private Person child;
    private LocalDate dateBirth, dateDeath;

    protected Person(String firstName, String lastName, Gender gender, 
     LocalDate dateBirth, LocalDate dateDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.dateDeath = dateDeath;
    }

    protected String setMother(Person mother) {
        this.mother = mother;
        return "Мать [ " + mother + " ]";
    }

    protected String setFather(Person father) {
        this.father = father;
        return "Отец [ " + father + " ]";
    }

    protected String setChild(Person child) {
        this.child = child;
        return "Ребенок [ " + child + " ]";
    }

    public String getFirstName() {
        return "Имя: " + firstName;
    }

    public String getLastName() {
        return "Фамилия: " + lastName;
    }

    public String getGender() {
        return "Пол: " + gender;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + ", "
                + "Фамилия: " + lastName + ", "
                + "Пол: " + gender + ','
                + " Дата рожденния: " + dateBirth + ','
                + " Дата смерти: " + dateDeath;
    }

}
