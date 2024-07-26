public class Person {
    String firstName;
    String lastName;
    String gender;
    Person mother;
    Person father;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }

    public String setMother(Person mother) {
        this.mother = mother;
        return "Мать [ " + mother + " ]";
    }

    public String setFather(Person father) {
        this.father = father;
        return "Отец [ " + father + " ]";
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
                + "Пол: " + gender;
    }

}
