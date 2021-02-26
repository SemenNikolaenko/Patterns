package chaunOfResponsibility;

import chaunOfResponsibility.chainValidation.Validation;

import java.util.HashMap;

public class Database {
    Validation validation;
    HashMap<String, String> usersData = new HashMap<>();

    {
        usersData.put("John@rembo", "123");
        usersData.put("James@bond", "321");
        usersData.put("Rick@sanchez", "222");
    }

    public boolean registry(String email, String password) {
        if (usersData.containsKey(email)) {
            System.out.println("this user already exist");
            return false;
        }
        usersData.put(email, password);
        return true;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public boolean isValidPassword(String email, String password) {
        return usersData.get(email).equals(password);
    }

    public boolean isExist(String email, String password) {
        if (usersData.containsKey(email)) return isValidPassword(email, password);
        else {
            System.out.println("User don't exist");
            return false;
        }
    }

    public boolean logIn(String email, String password) {
        if (validation.check(email, password))  return true;
        else return false;
    }

    public String canDownloadThis(String email, String password) {
        if (email.equals("Rick@sanchez")) return Role.ADMIN.name();
        else return Role.USER.name();
    }


}



