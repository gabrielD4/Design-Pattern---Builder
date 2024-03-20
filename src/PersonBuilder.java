import com.sun.jdi.request.InvalidRequestStateException;

import java.util.Optional;

public class PersonBuilder {

    private Optional<String> firstName;

    private Optional<String> secondName;

    private Optional<Integer> age;

    private Optional<String> address;

    public PersonBuilder() {
        this.firstName = Optional.empty();
        this.secondName = Optional.empty();
        this.age = Optional.empty();
        this.address = Optional.empty();
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = Optional.of(firstName);
        return this;
    }

    public PersonBuilder setSecondName(String secondName) {
        this.secondName = Optional.of(secondName);
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = Optional.of(age);
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = Optional.of(address);
        return this;
    }

    public Person build() {
        return new Person(
                firstName.orElseThrow(() -> new InvalidRequestStateException("Required parameter first name")),
                secondName.orElseThrow(() -> new InvalidRequestStateException("Required parameter second name")),
                age.orElse(0),
                address.orElse("Not specified"));
    }
}
