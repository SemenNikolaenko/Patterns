package prototype;

import java.util.Objects;

public abstract class User implements Cloneable {
    public String name;
    public String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public User(){}
    public User (User user){
        if (user!=null){
            this.name=user.name;
            this.surname= user.surname;
        }
    }
    public abstract User clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
