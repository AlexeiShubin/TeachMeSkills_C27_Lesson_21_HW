package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String info = gson.toJson(new Student("Alex", (byte) 3));
        System.out.println(info);
    }

}