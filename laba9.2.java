import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Math.*;

public class laba92 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\allan\\OneDrive\\Рабочий стол\\text2.txt");
        FileWriter fwr = new FileWriter(file1);
        String[][] table = tableArray(9, 9);
        StringBuilder tableF = new StringBuilder();

        for (int line = 0; line < table.length; line++){
            for (int column = 0; column < table[line].length; column++){
                tableF.append(line + 1).append(" + ").append(column + 1).append(" = ").append(table[line][column]).append("\t");
            }
            fwr.write(String.valueOf(tableF) + "\n");
            tableF = new StringBuilder();
        }
    }

    public static String[][] tableArray(int lines, int columns){
        String[][] tableCount = new String[lines][columns];
        for (int line = 0; line < tableCount.length; line++){
            for (int column = 0; column < tableCount[line].length; column++){
                tableCount[line][column] = String.valueOf((line + 1)+(column + 1));
            }
        }
        return tableCount;
    }
}
