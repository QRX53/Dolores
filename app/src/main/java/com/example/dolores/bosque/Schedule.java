package com.example.dolores.bosque;

import java.util.List;

public class Schedule {

    public Schedule() {

    }

    public static class Class {

        public String name;
        public String room;
        public String teacher;

        public Class(String n, String r, String t) {
            this.name = n;
            this.room = r;
            this.teacher = t;
        }

    }

    public static class Day {

        private int day;
        private List<Class> classes;

    }

}
