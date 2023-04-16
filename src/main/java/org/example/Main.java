package org.example;

public class Main {
    public static void main(String[] args) {
        String usersFile = "src/main/resources/test.txt";
        String jsonFileName = "src/main/resources/user.json";
        User[] users = UsersFileReader.readFile(usersFile);
        String jsons = MyJsonParser.parseToJson(users);
        MyJsonWriter.writeNewJson(jsons, jsonFileName);

        System.out.println(jsons);
    }
}
