package prototype;

public class CompUser extends User {
    public int id;

    public CompUser(CompUser compUser){
        super(compUser);
        if (compUser!=null){
            this.id = compUser.id;
        }
    }
    public CompUser(){
    }


    @Override
    public CompUser clone() {
        return new CompUser(this);
    }
}
