import java.io.*;

public class laba93 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\allan\\OneDrive\\Рабочий стол\\text3.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        String regular = "([a-z]*[A-Z])|([а-я]*[А-Я])";
        fwr.write("\n\nВЫВОД\n\n");
        while (fread.ready()){
            String str = fread.readLine();
            String[] mas = str.split("\\s+");
            for (int i = 0; i < mas.length; i++) {
                if (mas[i].matches(regular)) {
                    fwr.write(mas[i] + "\n");
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
}
