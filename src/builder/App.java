package builder;

public class App {
    public static void main(String[] args) {
        User user =new User.UserBuilder()
                            .setName("JJ")
                            .setSurname("GG")
                            .setAge(19)
                            .setCity("13")
                            .build();
        System.out.println(user.getAge());
        System.out.println(user.getName());
        System.out.println(user.getSurname());

//       --------------------------------------------

        Card card = Card.getBuilder()
                .setCardholder("Johnm")
                .build();
        System.out.println(card.getNameCardHolder());

    }


}
