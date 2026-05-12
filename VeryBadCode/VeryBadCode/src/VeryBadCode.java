//Ashish Ajay
//2026-05-06
//Simple file reader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class VeryBadCode{
    private String readFile(String fileName){
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            final StringBuilder stringBuilder = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return stringBuilder.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
