import java.io.*;

public class laba95 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\allan\\OneDrive\\Рабочий стол\\холоксер.txt");
        File file2 = new File("C:\\Users\\allan\\OneDrive\\Рабочий стол\\сочинение.txt");
        FileWriter fwr = new FileWriter(file2, true);
        BufferedReader fread = new BufferedReader(new FileReader(file1));
        String str = "(.*[A-Z][a-z]+.*[A-Z]+.*)|(.*[А-Я][а-я]+.*[А-Я]+.*)";
        String line = fread.readLine();
        String [] mas = line.split("\\.\\s");
        for (int i = 0; i < mas.length; i++){
           if (mas[i].matches(str)){
               fwr.write(" " + mas[i] + ".");
           }
        }
        fwr.flush();
        fwr.close();
    }
}
