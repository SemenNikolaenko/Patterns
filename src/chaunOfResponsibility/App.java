package chaunOfResponsibility;

import chaunOfResponsibility.chainValidation.RegistryValidation;
import chaunOfResponsibility.chainValidation.Validation;
import chaunOfResponsibility.chainValidation.ValidationRole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static Database server = new Database();

    public static void startChain(){
        Validation chain = new RegistryValidation(server);
        chain.linkWith(new ValidationRole(server));
        server.setValidation(chain);
    }

    public static void main(String[] args) throws IOException {
        startChain();
        boolean s = true;
        while (s){
            System.out.println("Enter email:");
            String email=bufferedReader.readLine();
            System.out.println("Enter password:");
            String password = bufferedReader.readLine();

            if (server.logIn(email,password)) s=false;
            else System.out.println("try again");

        }

    }
}
