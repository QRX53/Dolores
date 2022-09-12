package com.example.dolores.bosque;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<User> users = new ArrayList<>();

    static {
        users.add(new User("bigballs", "1629", "harry.harbuck-marlowe@bosquestudents.org", "harry.harbuck-marlowe@bosquestudents.org"));
        users.add(new User("bigblackballs", "1610", "miles.bellmore@bosquestudents.org", "miles.bellmore@bosquestudents.org"));
    }

    public static boolean verifyLogin(String user, String password) {

        // PLACEHOLDER CODE
        // TODO:
        // CHANGE THIS CODE LOL

        for (User u : users) {
            if (u.getUsername().matches(user)) {
                return u.getPassword().matches(password);
            }
        }
        return false;
    }

}
