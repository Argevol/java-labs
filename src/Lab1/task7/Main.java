package Lab1.task7;

public class Main {
    public static void main(final String[] args) {
        final User user1 = new User();
        final User user2 = new User();

        user1.setEmail("Bruno19@gmail.com");
        user2.setEmail("Pruno19@gmail.com");

        System.out.println(user1.equals(user2));
    }
}
