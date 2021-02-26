package chaunOfResponsibility.chainValidation;

import chaunOfResponsibility.Database;

public abstract class Validation {
    private Validation next;

    public Validation linkWith(Validation validation){
        this.next=validation;
        return next;
    }


    public abstract  boolean check(String email, String password);

    public boolean sendNext(String email, String password){
        if (next==null){
            return true;
        }
        return next.check(email, password);
    }
}
