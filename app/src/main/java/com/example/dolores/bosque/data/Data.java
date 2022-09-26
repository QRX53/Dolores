package com.example.dolores.bosque.data;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Data {

    public static List<User> users = new ArrayList<>();

    public static void json() throws IOException, URISyntaxException {
        //read json file data to String
        byte[] jsonData = new byte[0];
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            jsonData = Files.readAllBytes(Paths.get(Data.class.getResource("assets/students.json").toURI()));
        }

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        User emp = objectMapper.readValue(jsonData, User.class);

        System.out.println("\n\n\n\n\n" + emp + "\n\n\n\n\n");
    }

    static {
        try {
            json();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
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
