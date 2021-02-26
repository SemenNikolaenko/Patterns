package prototype;

public class App {
    public static void main(String[] args) {

        CompUser compUser = new CompUser();
        compUser.name="jj";
        compUser.surname="gg";
        compUser.id=1;
        CompUser compUser1 = compUser.clone();

        System.out.println(compUser1.name);
    }
}
