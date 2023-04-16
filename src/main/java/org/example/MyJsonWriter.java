package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class MyJsonWriter {
    public static void writeNewJson(String jsons, String jsonFileName) {
        if (jsons.length() == 0) {
            return;
        }

        try (FileWriter fileWriter = new FileWriter(jsonFileName)) {
            fileWriter.write(jsons);
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
