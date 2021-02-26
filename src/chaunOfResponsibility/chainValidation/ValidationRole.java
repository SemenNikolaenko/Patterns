package chaunOfResponsibility.chainValidation;

import chaunOfResponsibility.Database;
import chaunOfResponsibility.Role;

public class ValidationRole extends Validation {
    private Database database;

    public ValidationRole(Database database) {
        this.database = database;
    }

    @Override
    public boolean check(String email, String password) {
        if (database.canDownloadThis(email, password).equals(Role.ADMIN.name())){
            System.out.println("Hello Admin");
            sendNext(email, password);
            return true;
        }
        else {
            System.out.println("Hello User");
            sendNext(email, password);
            return true;
        }
    }
}
