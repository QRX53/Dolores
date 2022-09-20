package com.example.dolores.bosque;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<User> users = new ArrayList<>();

    static {
        users.add(new User("bigballs", "1629", "harryharbuck", "harry.harbuck-marlowe@bosquestudents.org"));
        users.add(new User("bigblackballs", "1610", "miles.bellmore@bosquestudents.org", "miles.bellmore@bosquestudents.org"));
    }

    public static boolean getNewNotifs() {
        return false;
    }

    public static String getLunch() {
        String lunch = "taco";
        return "\n\t\t\t" + lunch;
    }

    public static String getLunch(String day) {
        String lunch = "taco";
        return "\n\t\t\t" + lunch;
    }

    public static String getNextClass() {
        //TODO:
        // return next class from database
        return "You have physics next at: 9:45";
    }

    public static String getDay() {
        //TODO:
        //change this to be from a database
        return "6";
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
