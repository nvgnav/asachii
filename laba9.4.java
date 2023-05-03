import java.io.*;

public class laba94 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\allan\\OneDrive\\Рабочий стол\\text4.txt");
        FileWriter fwr = new FileWriter(file1, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        String regular = "([АОУЫЭЕЁИЮЯ]*)|([bcdfghjklmnpqrstvwxyz]*)|(\\W*)([_.,;:!?])(\\w*)";
        fwr.write("\n\nВЫВОД\n\n");
        while (fread.ready()){
            String line = fread.readLine();
            String[] mas = line.split("\\s+");
            for (String ma : mas) {
                if (ma.matches(regular)) {
                    fwr.write(ma + "\n");
                }
            }
        }
        fwr.flush();
        fwr.close();
    }
}
