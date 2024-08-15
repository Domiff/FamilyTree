package Human;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable, Comparable<Person> {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateBirth;

    public Person(String firstName, String lastName, Gender gender,
            LocalDate dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateBirth = dateBirth;
    }

    public String setMother(Person mother) {
        return " Мать [ " + mother + " ]";
    }

    public String setFather(Person father) {
        return " Отец [ " + father + " ]";
    }

    public String setChild(Person child) {
        return " Ребенок [ " + child + " ]";
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

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + ", "
                + "Фамилия: " + lastName + ", "
                + "Пол: " + gender + ','
                + " Дата рожденния: " + dateBirth;
    }

    @Override
    public int compareTo(Person person) {
        return firstName.compareTo(person.firstName);
    }

}
