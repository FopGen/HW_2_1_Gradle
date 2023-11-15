package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        User gladkiy = new User("Evgen","Gladkiy");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String jsonString = gson.toJson(gladkiy);
        System.out.println(jsonString);

    }
}