public class Main {
    public static void main(String[] args) {
        Person user1 = Person.builder("Gabriel", "Dello Iacovo").build();
        Person user2 = Person.builder("Linda", "Trenta").withAge(29).build();
        System.out.println("\n" + user1 + "\n" + user2);

    }
}