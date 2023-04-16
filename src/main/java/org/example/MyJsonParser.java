package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class MyJsonParser {
    public static String parseToJson(User[] users) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        return gson.toJson(users);
    }
}
