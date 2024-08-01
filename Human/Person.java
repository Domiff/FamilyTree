package Human;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Person mother;
    private Person father;
    private Person child;
    private LocalDate dateBirth;

    public Person(String firstName, String lastName, Gender gender, 
     LocalDate dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateBirth = dateBirth;
    }

    public String setMother(Person mother) {
        this.mother = mother;
        return " Мать [ " + mother + " ]";
    }

    public String setFather(Person father) {
        this.father = father;
        return " Отец [ " + father + " ]";
    }

    public String setChild(Person child) {
        this.child = child;
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


    @Override
    public String toString() {
        return "Имя: " + firstName + ", "
                + "Фамилия: " + lastName + ", "
                + "Пол: " + gender + ','
                + " Дата рожденния: " + dateBirth;
    } 

}
