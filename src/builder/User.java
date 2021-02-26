package builder;

public class User {
    private String name;
    private String surname;
    private int age;
    private String city;
    private User (){}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static class UserBuilder{
        private User user;

        public UserBuilder(){
            this.user = new User();
        }
        public UserBuilder setName(String name){
            this.user.name=name;
            return this;
        }
        public UserBuilder setSurname(String surname){
            this.user.surname=surname;
            return this;
        }
        public UserBuilder setAge(int age){
            this.user.age=age;
            return this;
        }
        public UserBuilder setCity (String city){
            this.user.city=city;
            return this;
        }
        public User build(){
            return user;
        }
    }
}
