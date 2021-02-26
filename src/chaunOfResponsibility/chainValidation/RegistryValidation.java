package chaunOfResponsibility.chainValidation;

import chaunOfResponsibility.Database;

public class RegistryValidation extends Validation {
    Database database;
    boolean badValidation = false;

    public RegistryValidation(Database database) {
        this.database = database;
    }

    @Override
    public boolean check(String email, String password) {
        if (database.isExist(email, password))
        {
            System.out.println("User exist");
            sendNext(email, password);
            return true;
        }
        else {


            return false;
        }
    }
}
