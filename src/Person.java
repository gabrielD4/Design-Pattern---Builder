import java.util.Optional;

public class Person {

    private final String firstName;

    private final String secondName;

    private final Integer age;

    private final String address;

    Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.secondName = builder.secondName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static PersonBuilder builder(String firstName, String secondName) {
        return new PersonBuilder(firstName, secondName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
