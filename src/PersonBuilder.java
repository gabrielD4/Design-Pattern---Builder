import com.sun.jdi.request.InvalidRequestStateException;

import java.util.Optional;

public class PersonBuilder {

    protected String firstName;

    protected String secondName;

    protected Integer age;

    protected String address;

    public PersonBuilder(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = null;
        this.address = "Undefined";
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
