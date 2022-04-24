package OOP.Application;

import OOP.Data.LoginReq;

public class RecordApp {
    public static void main(String[] args) {
        LoginReq loginrequest = new LoginReq("Stardenbart", "rahasia");

        System.out.println(loginrequest.username());
        System.out.println(loginrequest.password());
        System.out.println(loginrequest);

        System.out.println(new LoginReq());
        System.out.println(new LoginReq("Farhan"));
        System.out.println(new LoginReq("Farhan", "Rahasia"));
    }
}
