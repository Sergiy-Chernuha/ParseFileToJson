package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UsersFileReader {
    public static User[] readFile(String fileName) {
        List<User> resultList = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);

            scanner.nextLine();

            while (scanner.hasNext()) {
                String[] splitLine = scanner.nextLine().split(" ");
                resultList.add(new User(splitLine[0], Integer.parseInt(splitLine[1])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return resultList.toArray(new User[0]);
    }
}
