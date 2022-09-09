package com.example.dolores.bosque;

import java.util.HashMap;
import java.util.Map;

public class Information {

    public static Map<String, String> studentIds = new HashMap<>();

    public static String currentStudentName = null;
    public static int day;

    static {
        studentIds.put("1629", "Harry Harbuck-Marlowe");
    }

}
