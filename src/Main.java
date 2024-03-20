public class Main {
    public static void main(String[] args) {
        Person firstAvatar = new PersonBuilder()
                .setFirstName("Gabriel")
                .setSecondName("Dello Iacovo")
                .build();
        System.out.println(firstAvatar);
        Person secondAvatar = new PersonBuilder()
                .setFirstName("Linda")
                .setSecondName("Trenta")
                .setAge(28)
                .setAddress("Somewhere over the rainbow")
                .build();
        System.out.println(secondAvatar);
    }
}