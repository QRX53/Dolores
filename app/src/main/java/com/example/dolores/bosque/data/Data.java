package com.example.dolores.bosque.data;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Data {

    public static List<User> users = new ArrayList<>();
    public static Yaml yaml = new Yaml();
    static {
        InputStream inputStream = Data.class
                .getClassLoader()
                .getResourceAsStream("customer.yaml");
        Map<String, Object> obj = (Map<String, Object>) yaml.load(inputStream);



    }

//    static {
//        users.add(new User("bigballs", "1629", "harryharbuck", "harry.harbuck-marlowe@bosquestudents.org"));
//        users.add(new User("bigblackballs", "1610", "miles.bellmore@bosquestudents.org", "miles.bellmore@bosquestudents.org"));
//    }

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
